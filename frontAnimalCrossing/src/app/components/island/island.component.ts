import { Component, OnInit, ViewChild } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatTable } from '@angular/material/table';
import { Island } from 'src/app/models/island';
import { ApiService } from 'src/app/service/api.service';
import { IslandService } from 'src/app/service/island.service';

@Component({
  selector: 'app-island',
  templateUrl: './island.component.html',
  styleUrls: ['./island.component.css']
})

export class IslandComponent implements OnInit {

  @ViewChild(MatTable) tabla1!: MatTable<Island>;
  name:string="";

  villagerApi: any[] = [];//vecinos de la api
  totalVillagers: number = 0;//vecinos api
  islands: Island[]=[];
  island: Island= new Island("", 0, []);
  villagerName: string="";
  id:number = 0;
  villagerInput: string="";
  villager: string[]=[];
  idIslandLeader: number = 0;
  islandForm: FormGroup;
  nameInput: FormControl;
  idInput: FormControl;
  columnas: string[] = ['idIslandLeader','name', 'villagerName', 'delete'];


  constructor(
    private api: ApiService,
    private islandService: IslandService
  ) {

    this.islands = [];
    this.nameInput = new FormControl('', Validators.required);
    this.idInput = new FormControl('', Validators.required);

    this.islandForm = new FormGroup({
      name: this.nameInput,
      id: this.idInput
  });
  }

  ngOnInit(): void {
    this.getVillagersApi()
  }

  apiCorrection(objeto:any) {
    return JSON.parse(JSON.stringify(Object.entries(objeto)));
  }

  createIsland(){
    this.island.name = this.name;
    this.island.idIslandLeader = this.id;
    this.island.villagers = this.villager;

    this.islands.push(this.island);
    this.tabla1.renderRows();

    this.island = new Island("", 0, []);
    this.islandForm.reset();
    this.name="";
    this.id=0;
    this.villager=[];
  }

  getVillagersApi(){
    this.api.getVillagersIsland()
    .subscribe((response: any) => {
      this.totalVillagers = response.count;

      let myJsonArray = JSON.parse(JSON.stringify(Object.entries(response)[0][1]));

      let myJsonArray2 = JSON.parse(JSON.stringify(Object.entries(response)[0][1]));

      console.log(myJsonArray2);



      Object.entries(response).forEach((result: any) => {

        this.api.getVillager(JSON.parse(JSON.stringify(result[1])).id)
        .subscribe((uniqResponse: any) => {
          this.villagerApi.push(uniqResponse);

          console.log(this.villagerApi);
      });
    });
    });
  }


  deleteIsland(id: number) {
    if (confirm("Do you really want to delete it?")) {
      this.islands.splice(id, 1);
      this.tabla1.renderRows();
      window.alert("Data deleted successfully");
    }
  }

}
