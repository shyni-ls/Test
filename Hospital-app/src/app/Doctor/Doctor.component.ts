import { Component, OnInit } from '@angular/core';
import { Doctor } from '../Doctor';
import {HospitalService } from 'src/app/hospital.service';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';
import { FormControl, FormGroup, NgForm } from '@angular/forms';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';
@Component({
  selector: 'app-Doctor',
  templateUrl: './Doctor.component.html',
  styleUrls: ['./Doctor.component.css']
})
export class DoctorComponent implements OnInit {

  public doctor:Doctor;
  public errorMessage:string | null = null;
  public name:string|null = null;
 doc:Doctor={} as Doctor;
 closeResult = 'Saved';
 addDoctor=new FormGroup({
  name:new FormControl(''), age:new FormControl(''),
  gender:new FormControl(''), specilistField:new FormControl('')
});
  constructor(private activatedRoute:ActivatedRoute,private service:HospitalService,
    private router:Router,private modalService: NgbModal) { }

  ngOnInit(): void {
    this.service.getAllDoctors();
  }
  saveDoctor(){
    this.service.addDoctor(this.doctor).subscribe({
      next: (data)=>{
        alert("ADDED");
        this.router.navigate(['/']).then();
        
      },
      error: (e)=>{
        this.router.navigate(['/doctors/doctor/add']).then();
        alert("Error occured ! Try again..");

      }
    })
  }
  Doctorinfo(){
    if(this.doc.name){
      console.warn(this.doc.name);
      this.service.getDoctor(this.doc.name).subscribe({
        next: (data)=>{
          console.warn(data);
          this.doc = data;
        },
        error: (e)=>{
          this.errorMessage = e;
        }
      })
    }
  }
  public onAddDoctor(addForm: NgForm):void{
    this.service.addDoctor(addForm.value).subscribe((response:Doctor)=>{
      console.log(response);
    },
    (error:HttpErrorResponse)=>{alert(error.message)});
  }
  open(content: any) {
    this.modalService.open(content, {ariaLabelledBy: 'addDoctorModal'}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`; 
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }
  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
  }
}


