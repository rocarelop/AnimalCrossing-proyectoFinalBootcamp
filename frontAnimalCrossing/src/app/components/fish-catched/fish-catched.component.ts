import { Component, OnInit, ViewChild } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatTable } from '@angular/material/table';
import { Fish } from 'src/app/models/fish';
import { ApiService } from 'src/app/service/api.service';
import { FishCatchedService } from 'src/app/service/fish-catched.service';

@Component({
  selector: 'app-fish-catched',
  templateUrl: './fish-catched.component.html',
  styleUrls: ['./fish-catched.component.css']
})
export class FishCatchedComponent implements OnInit {
  @ViewChild(MatTable) tabla1!: MatTable<Fish>;
  fishes: any[] = [];
  totalFishes: number = 0;
  fishCatched: Fish[];
  fish: Fish= new Fish("", 0, "");
  name:string="";
  fishName: string="";
  id:number = 0;
  fishInput: string="";
  f: string="";
  idIslandLeader: number = 0;
  fishCatchedForm: FormGroup;
  nameInput: FormControl;
  idInput: FormControl;
  columnas: string[] = ['idIslandLeader','name', 'fishName', 'delete'];


  constructor(
    private api: ApiService,
    private fishCatchedService: FishCatchedService
  ) {

    this.fishCatched = [];
    this.nameInput = new FormControl('', Validators.required);
    this.idInput = new FormControl('', Validators.required);

    this.fishCatchedForm = new FormGroup({
      name: this.nameInput,
      id: this.idInput
  });
  }

  ngOnInit(): void {
    this.getFishesCatched()
  }

  apiCorrection(objeto:any) {
    return JSON.parse(JSON.stringify(Object.entries(objeto)));
  }

  addFish(){
    this.fish.name = this.name;//this.nameInput.value;
    this.fish.idIslandLeader = this.id;
    this.fish.fishName = this.f;

    this.fishCatched.push(this.fish);
    this.tabla1.renderRows();

    this.fish = new Fish("", 0, "");
    this.fishCatchedForm.reset();
    this.name="";
    this.id=0;
    this.f="";
  }

  getFishesCatched(){
    this.api.getFishesCatched()
    .subscribe((response: any) => {
      this.totalFishes = response.count;

      let myJsonArray = JSON.parse(JSON.stringify(Object.entries(response)[0][1]));

      let myJsonArray2 = JSON.parse(JSON.stringify(Object.entries(response)[0][1]));

      console.log(myJsonArray2);

      Object.entries(response).forEach((result: any) => {

        this.api.getFish(JSON.parse(JSON.stringify(result[1])).id)
        .subscribe((uniqResponse: any) => {
          this.fishes.push(uniqResponse);

          console.log(this.fishes);
      });
    });
    });
  }


  deleteFishCatched(id: number) {
    if (confirm("Do you really want to delete it?")) {
      this.fishCatched.splice(id, 1);
      this.tabla1.renderRows();
      window.alert("Data deleted successfully");
    }
  }

}
