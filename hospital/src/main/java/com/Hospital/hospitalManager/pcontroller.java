package com.Hospital.hospitalManager;

import java.util.List;

import com.Hospital.hospitalManager.exception.UserNotFoundException;
import com.Hospital.hospitalManager.model.Patient;
import com.Hospital.hospitalManager.service.patservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/patient")
public class pcontroller {
    private final patservice Patservice;

    public pcontroller(patservice Patservice){
        this.Patservice=Patservice;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Patient>> getAllDoctors(){
        List<Patient> doctors = Patservice.findAllPatients();
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Patient> getPatientsById(@PathVariable("id") int id){
        Patient patients = Patservice.findPatientById(id);
        if(patients==null){
            throw new UserNotFoundException("Patient not found");
        }
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient){
        Patient newpatient = Patservice.addPatient(patient);
        return new ResponseEntity<>(newpatient, HttpStatus.CREATED);
    }
}
