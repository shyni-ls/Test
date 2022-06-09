import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CreatepatientComponent } from './createpatient/createpatient.component';
import { DoctorComponent } from './Doctor/Doctor.component';
import { PatientComponent } from './Patient/Patient.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { HospitalService } from './hospital.service';
//import { SearchPipe } from './pipes';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CreatepatientComponent,
    DoctorComponent,
    PatientComponent,
    routingComponents,
   // SearchPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserModule,
    FormsModule,
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    HttpClientTestingModule,
    Ng2SearchPipeModule,
    NgbModal,
    

  ],
  providers: [HospitalService,HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
