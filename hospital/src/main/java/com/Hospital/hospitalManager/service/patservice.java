package com.Hospital.hospitalManager.service;

import java.util.List;

import com.Hospital.hospitalManager.exception.UserNotFoundException;
import com.Hospital.hospitalManager.model.Patient;
import com.Hospital.hospitalManager.repository.patrep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class patservice {
    private final patrep Patrep;
    @Autowired
    public patservice(patrep Patrep){
        this.Patrep=Patrep;
    }
    public Patient addPatient(Patient patient){
        return Patrep.save(patient);
    }
    public List<Patient> findAllPatients(){
        return Patrep.findAll();
    }
    public Patient findPatientById(int id){
        return Patrep.findPatientById(id).
        orElseThrow(()-> new UserNotFoundException("No such patient in database"));
   }
}