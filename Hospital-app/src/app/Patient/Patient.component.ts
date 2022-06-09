import { isNull } from '@angular/compiler/src/output/output_ast';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Patient } from '../Patient';
import { HospitalService } from '../hospital.service';

@Component({
  selector: 'app-Patient',
  templateUrl: './Patient.component.html',
  styleUrls: ['./Patient.component.css']
})
export class PatientComponent implements OnInit {
  public id:number | null= null ;
  public patients:Patient = {} as Patient;
  public errorMessage:string|null = null;

  constructor(private service:HospitalService , private router :Router) { }
 search:any
  ngOnInit(): void {
    
  }
  showPatientInfo(){
    if(this.id == null){
      alert("Please Enter Id");
    }
    else if(this.id){
      this.service.getPatient(this.id).subscribe({
        next : (data)=>{
          this.patients = data;
          alert("patient retireved Succesfully");
        },
        error : (e)=>{
          this.errorMessage = " Id not present in database";
          alert(this.errorMessage);
        }

      });
    }
    }
  
  }
