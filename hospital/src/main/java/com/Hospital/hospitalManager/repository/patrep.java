package com.Hospital.hospitalManager.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.Hospital.hospitalManager.model.Patient;

public interface patrep extends JpaRepository<Patient, Integer>{

    Optional<Patient> findPatientById(int id);  
       
}