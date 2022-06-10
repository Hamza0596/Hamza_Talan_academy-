import { TestBed } from '@angular/core/testing';

import { CnsscategoryService } from './cnsscategory.service';

describe('CnsscategoryService', () => {
  let service: CnsscategoryService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CnsscategoryService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
