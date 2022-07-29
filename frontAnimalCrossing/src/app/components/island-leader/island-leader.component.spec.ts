import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IslandLeaderComponent } from './island-leader.component';

describe('IslandLeaderComponent', () => {
  let component: IslandLeaderComponent;
  let fixture: ComponentFixture<IslandLeaderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IslandLeaderComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(IslandLeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
