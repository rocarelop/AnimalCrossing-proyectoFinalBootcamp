export class IslandLeader{


  constructor(
    private _id: number,
    private _name: string,
    private _hobby: string,
    private _photo: string = 'https://pbs.twimg.com/media/EMU7XaWW4AEDk-J.png'
  ){}
  public get hobby(): string {
    return this._hobby;
  }
  public set hobby(value: string) {
    this._hobby = value;
  }

  public get photo(): string {
    return this._photo;
  }
  public set photo(value: string) {
    this._photo = value;
  }

  public get name(): string {
    return this._name;
  }
  public set name(value: string) {
    this._name = value;
  }
  public get id(): number {
    return this._id;
  }
  public set id(value: number) {
    this._id = value;
  }



  public toJSON(): any {
    return {
      id: this._id,
      name: this._name,
      hobby: this._hobby,
      photo: this._photo
    };
  }
}
