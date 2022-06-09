import { HttpClient } from '@angular/common/http';
import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule,HttpTestingController } from '@angular/common/http/testing';
import { HospitalService } from './hospital.service';

describe('HospitalService', () => {
  let service: HospitalService;
  let http:HttpClient;
  let httpController:HttpTestingController;
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports:[HttpClientTestingModule],
      providers:[HospitalService,HttpClient,HttpClientTestingModule],
  
    });
    service = TestBed.inject(HospitalService);
    http = TestBed.inject(HttpClient);
    httpController = TestBed.inject(HttpTestingController);

  });

  it('service created', () => {
    expect(service).toBeDefined();
  });
});
