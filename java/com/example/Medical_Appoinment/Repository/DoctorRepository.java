package com.example.Medical_Appoinment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Medical_Appoinment.Entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {

}
