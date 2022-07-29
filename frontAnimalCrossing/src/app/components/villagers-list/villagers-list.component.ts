import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/service/api.service';

@Component({
  selector: 'app-villagers-list',
  templateUrl: './villagers-list.component.html',
  styleUrls: ['./villagers-list.component.css']
})
export class VillagersListComponent implements OnInit {
  villagers: any[]=[];
  page=1;
  totalVillagers: number=0;

  constructor(
    private api: ApiService
  ) { }

  ngOnInit(): void {
    this.getVillagers();
  }

  apiCorrection(objeto:any) {
    return JSON.parse(JSON.stringify(Object.entries(objeto)));
  }

  getVillagers() {
    this.api.getVillagers(24, this.page + 0)
    .subscribe((response: any) => {
      this.totalVillagers = response.count;

      let myJsonArray = JSON.parse(JSON.stringify(Object.entries(response)[0][1]));

      let myJsonArray2 = JSON.parse(JSON.stringify(Object.entries(response)[0][1]));

      console.log(myJsonArray2);

      /*
      console.log(myJsonArray.id);
      console.log(myJsonArray.name['name-EUes']);*/

      Object.entries(response).forEach((result: any) => {
    
        this.api.getVillager(JSON.parse(JSON.stringify(result[1])).id)
        .subscribe((uniqResponse: any) => {
          this.villagers.push(uniqResponse);

          console.log(this.villagers);
      });
    });
    });
  }

}
