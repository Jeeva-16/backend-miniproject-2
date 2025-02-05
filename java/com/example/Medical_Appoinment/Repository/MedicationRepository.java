package com.example.Medical_Appoinment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Medical_Appoinment.Entity.Medication;

@Repository
public interface MedicationRepository extends JpaRepository<Medication,Long> {

	List<Medication> findAll();

}
