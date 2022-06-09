import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreatepatientComponent } from './createpatient/createpatient.component';
import { HomeComponent } from './home/home.component';
import { DoctorComponent } from './Doctor/Doctor.component';
import {PatientComponent } from './Patient/Patient.component';

const routes: Routes = [
  { path:'',component:HomeComponent},
{ path:'home',component:HomeComponent},
  {path:'doctor' , component: DoctorComponent},
  {path:'createpatient' , component: CreatepatientComponent},
  {path:'patient' , component: PatientComponent},
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents =[HomeComponent, DoctorComponent,CreatepatientComponent,PatientComponent]
