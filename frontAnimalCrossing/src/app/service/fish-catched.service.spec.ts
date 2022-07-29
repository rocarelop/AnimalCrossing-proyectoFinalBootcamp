import { TestBed } from '@angular/core/testing';

import { FishCatchedService } from './fish-catched.service';

describe('FishCatchedService', () => {
  let service: FishCatchedService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FishCatchedService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
