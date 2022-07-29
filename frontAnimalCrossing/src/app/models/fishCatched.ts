import { IslandLeader } from "./islandLeader";

export class FishCatched{

  constructor(
  private _id: number | null,
  private _name: string,
  private _islandLeader: IslandLeader,
  private _fishCatched: string[]
  ){}

  public get fishCatched(): string[] {
    return this._fishCatched;
  }
  public set fishCatched(value: string[]) {
    this._fishCatched = value;
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
    return {
      id: this._id,
      name: this._name,
      islandLeader: this._islandLeader,
      fishCatched: this._fishCatched
    };
  }
}
