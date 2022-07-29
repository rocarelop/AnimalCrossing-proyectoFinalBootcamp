import { TestBed } from '@angular/core/testing';

import { IslandLeaderService } from './island-leader.service';

describe('IslandLeaderService', () => {
  let service: IslandLeaderService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(IslandLeaderService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
