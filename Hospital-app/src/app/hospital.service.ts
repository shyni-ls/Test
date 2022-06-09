import { environment } from '../environments/environment';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Doctor } from './Doctor';
import { Patient } from './Patient';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HospitalService {

  private apiserverUrl=environment.apiBaseUrl;  
  constructor(private http:HttpClient) { }

  public getAllDoctors():Observable<Doctor[]>{
    return this.http.get<Doctor[]>(`${this.apiserverUrl}/doctor/all`);
  }
  public getDoctor(name:string):Observable<Doctor>{
   return this.http.get<Doctor>(`${this.apiserverUrl}/doctor/find/${doctorname}`);
 }
  public addDoctor(doctor : Doctor):Observable<Doctor>{
   return this.http.post<Doctor>(`${this.apiserverUrl}/doctor/add`,doctor);
 }
 public getPatient(patientid : number):Observable<Patient>{
  return this.http.get<Patient>(`${this.apiserverUrl}/patient/find/${patientid}`);
 }
 public addPatient(patient : Patient):Observable<Patient>{
  return this.http.post<Patient>(`${this.apiserverUrl}/patient/add`,patient);
 }

}
