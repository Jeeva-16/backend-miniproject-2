package com.example.Medical_Appoinment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Medical_Appoinment.Dto.DoctorDto;
import com.example.Medical_Appoinment.Dto.MedicationDto;
import com.example.Medical_Appoinment.Dto.PatientDto;
import com.example.Medical_Appoinment.Entity.Doctor;
import com.example.Medical_Appoinment.Service.DoctorService;
import com.example.Medical_Appoinment.Service.MedicationService;
import com.example.Medical_Appoinment.Service.PatientService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MedicineController {
	@Autowired
   private PatientService patientService;
	
	@GetMapping("/register")
	public String showForm(Model model) {
		PatientDto patientDto = new PatientDto();
		model.addAttribute("patientDto",patientDto);
		return "register";
	}
	@PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("patientDto") PatientDto patientDto, 
                               BindingResult result,
                               Model model) {
        patientService.savePatient( patientDto );		
        return "redirect:/doctors?success";
	}
	@Autowired
	private DoctorService doctorService;
	@GetMapping("/doctors")
	public String getDoctor(){
		List<DoctorDto> doctorDto = doctorService.getAllDoctors();
		return "doctors";
	}
	@Autowired
	private MedicationService medicationService;
	@GetMapping("/medicines")
	public String getMedicines() {
		List<MedicationDto> medicationDto = medicationService.getAllMedicines();
		return "medicines";
	}


}
