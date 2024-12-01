package com.example.Medical_Appoinment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Medical_Appoinment.Dto.DoctorDto;
import com.example.Medical_Appoinment.Entity.Doctor;
import com.example.Medical_Appoinment.Mapper.DoctorMapper;
import com.example.Medical_Appoinment.Repository.DoctorRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService{
	@Autowired
  private DoctorRepository doctorRepository;
	@Autowired
  private DoctorMapper doctorMapper;
	@Override
	public List<DoctorDto> getAllDoctors() {
		List<Doctor> doctor = doctorRepository.findAll();
		return doctor.stream().map(DoctorMapper :: mapToDoctorDto).toList();
	}

}
