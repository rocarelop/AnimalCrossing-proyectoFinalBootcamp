import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IslandLeader } from '../models/islandLeader';

@Injectable({
  providedIn: 'root'
})
export class IslandLeaderService {
  private readonly BASE_URL = 'http://localhost:8080/island-leaders'
  constructor(private http:HttpClient) { }

  getAllIslandLeaders(): Observable<IslandLeader[]> {
    return this.http.get<IslandLeader[]>(this.BASE_URL);
  }

  getIslandLeaderById(id:number){
    return this.http.get(`${this.BASE_URL}/${id}`);
  }

  createIslandLeader(islandLeader: IslandLeader){
    return this.http.post(this.BASE_URL, islandLeader);
  }

  deleteIslandLeader(id: number) {
    return this.http.delete(`${this.BASE_URL}/${id}`);
  }


}
