import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }

  getVillagers(limit: number, offset: number) {
    return this.http.get(`http://acnhapi.com/v1/villagers?limit=${limit}&offset=${offset}`);
  }

  getVillager(villagerID: number) {
    return this.http.get(`http://acnhapi.com/v1/villagers/${villagerID}`);
  }

  getVillagersIsland() {
    return this.http.get(`http://acnhapi.com/v1/villagers`);
  }

  getFishes(limit: number, offset: number) {
    return this.http.get(`http://acnhapi.com/v1/fish?limit=${limit}&offset=${offset}`);
  }
  getFishesCatched() {
    return this.http.get(`http://acnhapi.com/v1/fish`);
  }

  getFish(fishID: number) {
    return this.http.get(`http://acnhapi.com/v1/fish/${fishID}`);
  }
  getBugs(limit: number, offset: number) {
    return this.http.get(`http://acnhapi.com/v1/bugs?limit=${limit}&offset=${offset}`);
  }

  getBug(bugID: number) {
    return this.http.get(`http://acnhapi.com/v1/bugs/${bugID}`);
  }
  getBugsCatched() {
    return this.http.get(`http://acnhapi.com/v1/bugs`);
  }

}
