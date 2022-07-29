import { Component, OnInit, ViewChild } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatTable } from '@angular/material/table';
import { Bug } from 'src/app/models/bug';
import { ApiService } from 'src/app/service/api.service';
import { BugCatchedService } from 'src/app/service/bug-catched.service';

@Component({
  selector: 'app-bug-catched',
  templateUrl: './bug-catched.component.html',
  styleUrls: ['./bug-catched.component.css']
})
export class BugCatchedComponent implements OnInit {
  @ViewChild(MatTable) tabla1!: MatTable<Bug>;
  bugs: any[] = [];
  totalBugs: number = 0;
  bugCatched: Bug[];
  bug: Bug= new Bug("", 0, "");
  name:string="";
  bugName: string="";
  id:number = 0;
  bugInput: string="";
  b: string="";
  idIslandLeader: number = 0;
  bugCatchedForm: FormGroup;
  nameInput: FormControl;
  idInput: FormControl;
  columnas: string[] = ['idIslandLeader','name', 'bugName', 'delete'];


  constructor(
    private api: ApiService,
    private bugCatchedService: BugCatchedService
  ) {

    this.bugCatched = [];
    this.nameInput = new FormControl('', Validators.required);
    this.idInput = new FormControl('', Validators.required);

    this.bugCatchedForm = new FormGroup({
      name: this.nameInput,
      id: this.idInput
  });
  }

  ngOnInit(): void {
    this.getBugsCatched()
  }

  apiCorrection(objeto:any) {
    return JSON.parse(JSON.stringify(Object.entries(objeto)));
  }

  addBug(){
    this.bug.name = this.name;//this.nameInput.value;
    this.bug.idIslandLeader = this.id;
    this.bug.bugName = this.b;

    this.bugCatched.push(this.bug);
    this.tabla1.renderRows();

    this.bug = new Bug("", 0, "");
    this.bugCatchedForm.reset();
    this.name="";
    this.id=0;
    this.b="";
  }

  getBugsCatched(){
    this.api.getBugsCatched()
    .subscribe((response: any) => {
      this.totalBugs = response.count;

      let myJsonArray = JSON.parse(JSON.stringify(Object.entries(response)[0][1]));

      let myJsonArray2 = JSON.parse(JSON.stringify(Object.entries(response)[0][1]));

      console.log(myJsonArray2);

      Object.entries(response).forEach((result: any) => {

        this.api.getBug(JSON.parse(JSON.stringify(result[1])).id)
        .subscribe((uniqResponse: any) => {
          this.bugs.push(uniqResponse);

          console.log(this.bugs);
      });
    });
    });
  }


  deleteBugCatched(id: number) {
    if (confirm("Do you really want to delete it?")) {
      this.bugCatched.splice(id, 1);
      this.tabla1.renderRows();
      window.alert("Data deleted successfully");
    }
  }

}
