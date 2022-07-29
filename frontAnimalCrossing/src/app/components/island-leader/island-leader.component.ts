import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { MessageService } from 'primeng/api';
import { IslandLeader } from 'src/app/models/islandLeader';
import { IslandLeaderService } from 'src/app/service/island-leader.service';

@Component({
  selector: 'app-island-leader',
  templateUrl: './island-leader.component.html',
  styleUrls: ['./island-leader.component.css']
})

export class IslandLeaderComponent implements OnInit {

  islandLeaderList: IslandLeader[];
  islandLeaderForm : FormGroup;
  nameInput : FormControl;
  hobbyInput : FormControl;
  islandLeader: IslandLeader;
  id:number=0;

  constructor(private islandLeaderService: IslandLeaderService, private messageService: MessageService) {

    this.islandLeaderList = [];
    this.islandLeader= new IslandLeader(0," ", " ", " ")

    this.nameInput = new FormControl('', Validators.required);
    this.hobbyInput = new FormControl('', Validators.required);

    this.islandLeaderForm = new FormGroup({
      name: this.nameInput,
      hobby: this.hobbyInput
    });

  }

 onSubmit(): void {
    console.log('Island Leader submitted');
    const islandLeader: IslandLeader = new IslandLeader(0, this.islandLeaderForm.get("name")?.value, this.islandLeaderForm.get("hobby")?.value);
    console.log(islandLeader);
    this.islandLeaderService.createIslandLeader(islandLeader).subscribe(
      data => {
        console.log(data);
        this.showIslandLeaders();
      }
    );
  }

  ngOnInit(): void {
    this.showIslandLeaders();
  }

  showIslandLeaders(): void {
    this.islandLeaderService.getAllIslandLeaders().subscribe(
      islandLeaderListBack => {
        this.islandLeaderList = islandLeaderListBack;
      }
    );
  }

  deleteIslandLeader(id:number): void {
    this.islandLeaderList.splice(id,1);
    this.islandLeaderService.deleteIslandLeader(id).subscribe(
      data => {
        console.log(data);
        this.showIslandLeaders();
        //this.messageService.add({severity:'success', summary:'Service Message', detail:'Via MessageService'});
        window.alert("successfully deleted Island Leader!")
      }
    );
  }
}

