import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FishesListComponent } from './fishes-list.component';

describe('FishesListComponent', () => {
  let component: FishesListComponent;
  let fixture: ComponentFixture<FishesListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FishesListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FishesListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
