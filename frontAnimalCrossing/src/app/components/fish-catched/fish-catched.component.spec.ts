import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FishCatchedComponent } from './fish-catched.component';

describe('FishCatchedComponent', () => {
  let component: FishCatchedComponent;
  let fixture: ComponentFixture<FishCatchedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FishCatchedComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FishCatchedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
