import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Doctor } from '../Doctor';
import { Patient } from '../Patient';
import { HospitalService } from '../hospital.service';

@Component({
  selector: 'app-createpatient',
  templateUrl: './createpatient.component.html',
  styleUrls: ['./createpatient.component.css']
})
export class CreatepatientComponent implements OnInit {

  public patient:Patient ={} as Patient;
  public doctors:Doctor[] = {} as Doctor[];
  public errorMessage:string | null = null;

  constructor(private service:HospitalService , private router:Router) { }

  ngOnInit(): void {
    this.service.getAllDoctors().subscribe({
      next:(data) =>{
        this.doctors = data;
      }
    })
  }
  savePatient(){
    this.service.addPatient(this.patient).subscribe({
      next:(data)=>{
        alert("Patient Added Success...")
        this.router.navigate(['/']).then();
      },
      error:(e)=>{
        this.errorMessage = e;
        console.warn(e);
        alert("Invalid Information")
        this.router.navigate(['/patients/patient/add']).then();
      }
    });
  }
}
