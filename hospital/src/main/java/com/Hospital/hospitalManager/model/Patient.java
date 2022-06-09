package com.Hospital.hospitalManager.model;

import java.io.Serializable;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Patient implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(nullable = false ,updatable = false)
        private int id;
        private String Name;
        private  int age;
        @Column(unique = true)
        private String visitedDoctor;
        private LocalDate DateOfVisit;
        private String prescription;
    
    public Patient(){}
    public Patient(String Name,String visitedDoctor,LocalDate DateOfVisit)
    {
        this.Name=Name;
        this.setVisitedDoctor(visitedDoctor);
        this.DateOfVisit=DateOfVisit;
    }
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getVisitedDoctor() {
        return visitedDoctor;
    }
    public void setVisitedDoctor(String visitedDoctor) {
        this.visitedDoctor = visitedDoctor;
    }
    public LocalDate getDateOfVisit() {
        return DateOfVisit;
    }
    public void setDateOfVisit(LocalDate DateOfVisit) {
        this.DateOfVisit = DateOfVisit;
    }



    /**
     * @return String return the prescription
     */
    public String getPrescription() {
        return prescription;
    }

    /**
     * @param prescription the prescription to set
     */
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    public void add(Patient patient) {
    }

}