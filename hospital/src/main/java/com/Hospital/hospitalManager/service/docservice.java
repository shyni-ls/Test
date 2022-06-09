package com.Hospital.hospitalManager.service;

import java.util.List;

import com.Hospital.hospitalManager.exception.UserNotFoundException;
import com.Hospital.hospitalManager.model.Doctor;
import com.Hospital.hospitalManager.repository.docrep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class docservice {
    private final docrep Docrep;
    @Autowired
    public docservice(docrep Docrep){
        this.Docrep=Docrep;
    }
    public Doctor addDoctor(Doctor doctor){
        return Docrep.save(doctor);
    }
    public List<Doctor> findAllDoctors(){
        return Docrep.findAll();
    }
    public Doctor getDoctor(String name){
        return Docrep.findDoctor(name).
        orElseThrow(()-> new UserNotFoundException("No Doctor Found"));
   }
}