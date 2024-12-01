package com.example.Medical_Appoinment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Medical_Appoinment.Dto.MedicationDto;
import com.example.Medical_Appoinment.Entity.Doctor;
import com.example.Medical_Appoinment.Entity.Medication;
import com.example.Medical_Appoinment.Mapper.DoctorMapper;
import com.example.Medical_Appoinment.Mapper.MedicationMapper;
import com.example.Medical_Appoinment.Repository.MedicationRepository;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor
public class MedicationServiceImpl implements MedicationService{
	@Autowired
private MedicationRepository medicationRepository;
	@Autowired
private MedicationMapper medicationMapper;
	
	public List<MedicationDto> getAllMedicines() {
		
		List<Medication> medication = medicationRepository.findAll();
		return medication.stream().map(MedicationMapper :: mapToMedicationDto).toList();	}

}
