import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Island } from '../models/island';

@Injectable({
  providedIn: 'root'
})
export class IslandService {


private readonly BASE_URL = 'http://localhost:8080/islands'
constructor(private http:HttpClient) { }

getAllIslands(): Observable<Island[]> {
  return this.http.get<Island[]>(this.BASE_URL);
}

getIslandById(id:number){
  return this.http.get(`${this.BASE_URL}/${id}`);
}

createIsland(island: Island){
  return this.http.post(this.BASE_URL, island);
}

deleteIsland(id: number) {
  return this.http.delete(`${this.BASE_URL}/${id}`);
}
}
