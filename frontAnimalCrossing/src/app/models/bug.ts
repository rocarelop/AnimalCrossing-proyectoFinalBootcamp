export class Bug
{

  constructor(

    private _name: string,
    private _idIslandLeader: number,
    private _bugName: string)
  {
  }
  public get bugName(): string {
    return this._bugName;
  }
  public set bugName(value: string) {
    this._bugName = value;
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
