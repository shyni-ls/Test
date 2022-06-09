package com.Hospital.hospitalManager.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Doctor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false ,updatable = false)
    private int id;
    private String name;
    private int age;
    private String gender;
    private String specilistField;
    private int visitedpatient_count=0;
    
@OneToMany
private List<Patient> patient;
public List<Patient> getPatient() {
    return patient;
}
public void addPatient(Patient patient){
    patient.add(patient);
}
public Doctor(){}
public Doctor(String name,int age,String gender,String specilistField)
{
    this.age=age;
    this.name=name;
    this.gender=gender;
    this.specilistField=specilistField;
}
public int getid(){
    return id;
}
public void setid(int id){
    this.id=id;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public int getVisitedpatient_count() {
    return visitedpatient_count;
}
public void setVisitedpatient_count(int visitedpatient) {
    this.visitedpatient_count+=1;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
public String getSpecilistField() {
    return specilistField;
}
public void setSpecilistField(String specilistField) {
    this.specilistField = specilistField;
}
@Override
public String toString(){
    return " Doctor Details :"+"Id : "+id+" , Name : "+name+
    " , age : "+age+" , gender :"+gender+" , specilistField :"+specilistField;
}


}

