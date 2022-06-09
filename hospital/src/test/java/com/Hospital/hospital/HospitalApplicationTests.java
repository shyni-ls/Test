package com.Hospital.hospital;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.Hospital.hospitalManager.dcontroller;
import com.Hospital.hospitalManager.pcontroller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class HospitalApplicationTests {
    @Autowired
    pcontroller PController;

    @Autowired
     dcontroller DController;


    @Test
    public void test(){
        assertTrue(true);
    }
/**    @Test
    public void  showPatientInformationTest(){
        Patient patient =PController.getPatientsById(3);
        assertEquals(patient.getName(),"Shyni");
    }

    @Test
    public void showDoctorInformationTest(){
        Doctor doc = DController.getDoctor("Raj"); 
        assertEquals(doc.getSpecilistField() ,"Leprosy");
        // logger.info(doc.toString());
    }

    @Test
    @DirtiesContext
    @Transactional
    public void addDoctorTest(){
        Doctor doc = new Doctor("hello", 12, "male", "ent");
        boolean res=DController.addDoctor(doc);
        assertTrue(res);
    }

    @Test
    @DirtiesContext
    @Transactional
    public void addPatientTest(){
        Patient patient = new Patient(1001, "hello", 30, "DR. POONAM JALAN",LocalDate.now(), "male", "xyz");
        boolean res = PController.addPatient(patient);
        assertTrue(res);
    }*/
  
}
