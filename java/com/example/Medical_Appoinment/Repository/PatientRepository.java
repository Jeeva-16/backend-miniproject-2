package com.example.Medical_Appoinment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Medical_Appoinment.Dto.PatientDto;
import com.example.Medical_Appoinment.Entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

	Patient save(PatientDto patientDto);


}
