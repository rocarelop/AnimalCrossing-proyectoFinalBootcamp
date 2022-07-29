import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { FishCatched } from '../models/fishCatched';

@Injectable({
  providedIn: 'root'
})
export class FishCatchedService {
  private readonly BASE_URL = 'http://localhost:8080/fishcatcheds'
  constructor(private http: HttpClient) { }

getAllFishCatched(): Observable<FishCatched[]> {
    return this.http.get<FishCatched[]>(this.BASE_URL);
}

getFishCatchedById(id:number){
  return this.http.get(`${this.BASE_URL}/${id}`);
}

createFishCatched(fishCatched: FishCatched){
  return this.http.post(this.BASE_URL, fishCatched);
}

deleteFishCatched(id:number){
  return this.http.delete(`${this.BASE_URL}/${id}`);
}

}
