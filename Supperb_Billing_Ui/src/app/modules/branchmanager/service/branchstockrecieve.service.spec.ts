import { TestBed } from '@angular/core/testing';

import { BranchstockrecieveService } from './branchstockrecieve.service';

describe('BranchstockrecieveService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BranchstockrecieveService = TestBed.get(BranchstockrecieveService);
    expect(service).toBeTruthy();
  });
});
