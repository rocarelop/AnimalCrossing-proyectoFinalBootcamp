import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/service/api.service';

@Component({
  selector: 'app-fishes-list',
  templateUrl: './fishes-list.component.html',
  styleUrls: ['./fishes-list.component.css']
})
export class FishesListComponent implements OnInit {
  fishes: any[] = [];
  page = 1;
  totalFishes: number = 0;

  constructor(
    private api: ApiService
  ) { }


  ngOnInit(): void {
    this.getFishes();
  }

  apiCorrection(objeto:any) {
    return JSON.parse(JSON.stringify(Object.entries(objeto)));
  }
  
  getFishes() {
    this.api.getFishes(24, this.page + 0)
    .subscribe((response: any) => {
      this.totalFishes = response.count;

      let myJsonArray = JSON.parse(JSON.stringify(Object.entries(response)[0][1]));

      let myJsonArray2 = JSON.parse(JSON.stringify(Object.entries(response)[0][1]));

      console.log(myJsonArray2);

      /*
      console.log(myJsonArray.id);
      console.log(myJsonArray.name['name-EUes']);*/

      Object.entries(response).forEach((result: any) => {

        this.api.getFish(JSON.parse(JSON.stringify(result[1])).id)
        .subscribe((uniqResponse: any) => {
          this.fishes.push(uniqResponse);

          console.log(this.fishes);
      });
    });
    });
  }
}
