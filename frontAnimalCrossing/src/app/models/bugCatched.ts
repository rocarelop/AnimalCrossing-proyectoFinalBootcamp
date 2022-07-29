import { IslandLeader } from "./islandLeader";

export class BugCatched{


  constructor(
  private _id: number | null,
  private _name: string,
  private _islandLeader: IslandLeader,
  private _bugCatched: string[]
  ){}
  public get bugCatched(): string[] {
    return this._bugCatched;
  }
  public set bugCatched(value: string[]) {
    this._bugCatched = value;
  }
  public get islandLeader(): IslandLeader {
    return this._islandLeader;
  }
  public set islandLeader(value: IslandLeader) {
    this._islandLeader = value;
  }
  public get name(): string {
    return this._name;
  }
  public set name(value: string) {
    this._name = value;
  }
  public get id(): number | null {
    return this._id;
  }
  public set id(value: number | null) {
    this._id = value;
  }

  public toJSON(): any {
    return{
      id:this._id,
      name:this._name,
      islandLeader:this._islandLeader,
      bugCatched:this._bugCatched

    }
}
}
