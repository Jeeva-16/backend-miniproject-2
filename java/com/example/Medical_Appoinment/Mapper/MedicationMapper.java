package com.example.Medical_Appoinment.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.Medical_Appoinment.Dto.MedicationDto;
import com.example.Medical_Appoinment.Entity.Medication;

@Component

public class MedicationMapper {
	public static MedicationDto mapToMedicationDto(Medication medication) {
		MedicationDto medicationDto = new MedicationDto();
		BeanUtils.copyProperties(medication, medicationDto);
		
		return medicationDto;

	}
	
	public static Medication mapToMedication(MedicationDto medicationDto) {
		Medication medication = new Medication();
		BeanUtils.copyProperties(medicationDto, medication);
        
		
		return medication;
}
}
