package com.example.Medical_Appoinment.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.Medical_Appoinment.Dto.DoctorDto;
import com.example.Medical_Appoinment.Entity.Doctor;

@Component
public class DoctorMapper {
	public static DoctorDto mapToDoctorDto(Doctor doctor) {
		DoctorDto doctorDto = new DoctorDto();
		BeanUtils.copyProperties(doctor, doctorDto);
		
		return doctorDto;

	}
	
	public static Doctor mapToDoctor(DoctorDto doctorDto) {
		Doctor doctor = new Doctor();
		BeanUtils.copyProperties(doctorDto, doctor);
        
		
		return doctor;
}
}
