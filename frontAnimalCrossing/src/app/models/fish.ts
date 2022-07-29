export class Fish
{

  constructor(

    private _name: string,
    private _idIslandLeader: number,
    private _fishName: string)
  {
  }
  public get fishName(): string {
    return this._fishName;
  }
  public set fishName(value: string) {
    this._fishName = value;
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

}
