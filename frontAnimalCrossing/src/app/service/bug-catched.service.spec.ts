import { TestBed } from '@angular/core/testing';

import { BugCatchedService } from './bug-catched.service';

describe('BugCatchedService', () => {
  let service: BugCatchedService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BugCatchedService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
