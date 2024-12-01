package com.example.Medical_Appoinment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Medical_Appoinment.Dto.PatientDto;
import com.example.Medical_Appoinment.Entity.Patient;
import com.example.Medical_Appoinment.Mapper.PatientMapper;
import com.example.Medical_Appoinment.Repository.PatientRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class PatientServiceImplementation implements PatientService{
	@Autowired
   private PatientRepository patientRepository;
	@Autowired
   private PatientMapper patientMapper;
	public PatientDto savePatient(PatientDto patientDto) {
		Patient patient = patientMapper.mapToPatient( patientDto);
		Patient savedPatient = patientRepository.save(patientDto);
		PatientDto returnedDto = patientMapper.mapToPatientDto(savedPatient);
		return returnedDto;
	}

	

}
