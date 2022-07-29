import { IslandLeader } from "./islandLeader";

export class Island {



  constructor(
    private _name: string,
    private _idIslandLeader: number,
    private _villagers: string[]

  ) { }
  public get villagers(): string[] {
    return this._villagers;
  }
  public set villagers(value: string[]) {
    this._villagers = value;
  }
  public get idIslandLeader(): number {
    return this._idIslandLeader;
  }
  public set idIslandLeader(value: number) {
    this._idIslandLeader = value;
  }

  public get name(): string {
    return this._name;
  }
  public set name(value: string) {
    this._name = value;
  }


  public toJSON(): any{
    return {
      name: this._name,
      idIslandLeader: this._idIslandLeader,
      villagers: this._villagers

    }
  }
}
