import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BugCatched } from '../models/bugCatched';

@Injectable({
  providedIn: 'root'
})
export class BugCatchedService {

  private readonly BASE_URL = 'http://localhost:8080/fishcatcheds'
  constructor(private http: HttpClient) { }

getAllBugCatched(): Observable<BugCatched[]> {
    return this.http.get<BugCatched[]>(this.BASE_URL);
}

getBugCatchedById(id:number){
  return this.http.get(`${this.BASE_URL}/${id}`);
}

createBugCatched(bugCatched: BugCatched){
  return this.http.post(this.BASE_URL, bugCatched);
}

deleteBugCatched(id:number){
  return this.http.delete(`${this.BASE_URL}/${id}`);
}

}
