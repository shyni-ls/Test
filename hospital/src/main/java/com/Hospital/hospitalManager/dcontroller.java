package com.Hospital.hospitalManager;

import java.util.List;

import com.Hospital.hospitalManager.model.Doctor;
import com.Hospital.hospitalManager.service.docservice;

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
@RequestMapping("/doctor")
public class dcontroller {
    private final docservice Docservice;

    public dcontroller(docservice Docservice){
        this.Docservice=Docservice;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Doctor>> getAllDoctors(){
        List<Doctor> doctors = Docservice.findAllDoctors();
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }
    @GetMapping("/find/{name}")
    public ResponseEntity<Doctor> getDoctor(@PathVariable("name") String name){
        Doctor doctors = Docservice.getDoctor(name);
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor){
        Doctor newdoctor = Docservice.addDoctor(doctor);
        return new ResponseEntity<>(newdoctor, HttpStatus.CREATED);
    }
}