import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/service/api.service';

@Component({
  selector: 'app-bugs-list',
  templateUrl: './bugs-list.component.html',
  styleUrls: ['./bugs-list.component.css']
})
export class BugsListComponent implements OnInit {
  bugs: any[]=[];
  page=1;
  totalBugs: number=0;
  constructor(
    private api: ApiService
  ) { }


  ngOnInit(): void {
    this.getBugs();
  }

  apiCorrection(objeto:any) {
    return JSON.parse(JSON.stringify(Object.entries(objeto)));
  }

  getBugs() {
    this.api.getBugs(24, this.page + 0)
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

}
