import { TestBed } from '@angular/core/testing';

import { PuntosServicesService } from './puntos-services.service';

describe('PuntosServicesService', () => {
  let service: PuntosServicesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PuntosServicesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
