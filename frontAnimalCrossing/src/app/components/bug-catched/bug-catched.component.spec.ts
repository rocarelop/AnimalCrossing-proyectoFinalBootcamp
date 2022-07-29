import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BugCatchedComponent } from './bug-catched.component';

describe('BugCatchedComponent', () => {
  let component: BugCatchedComponent;
  let fixture: ComponentFixture<BugCatchedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BugCatchedComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BugCatchedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
