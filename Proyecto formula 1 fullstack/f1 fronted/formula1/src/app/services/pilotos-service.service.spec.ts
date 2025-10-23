import { TestBed } from '@angular/core/testing';

import { PilotosServiceService } from './pilotos-service.service';

describe('PilotosServiceService', () => {
  let service: PilotosServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PilotosServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
