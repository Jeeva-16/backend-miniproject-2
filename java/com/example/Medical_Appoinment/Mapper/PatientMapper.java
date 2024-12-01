package com.example.Medical_Appoinment.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.Medical_Appoinment.Dto.PatientDto;
import com.example.Medical_Appoinment.Entity.Patient;

@Component
public class PatientMapper {
	public static PatientDto mapToPatientDto(Patient patient) {
		PatientDto patientDto = new PatientDto();
		BeanUtils.copyProperties(patient, patientDto);
		
		return patientDto;

	}
	
	public static Patient mapToPatient(PatientDto patientDto) {
		Patient patient = new Patient();
		BeanUtils.copyProperties(patientDto, patient);
        
		
		return patient;
		
	
	}
}
