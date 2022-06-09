package com.Hospital.hospitalManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.Hospital.hospitalManager.model.Doctor;

public interface docrep extends JpaRepository<Doctor ,Integer >{


    Optional<Doctor> findDoctor(String name);  
}