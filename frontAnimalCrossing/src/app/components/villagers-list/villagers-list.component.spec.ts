import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VillagersListComponent } from './villagers-list.component';

describe('VillagersListComponent', () => {
  let component: VillagersListComponent;
  let fixture: ComponentFixture<VillagersListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VillagersListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VillagersListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
