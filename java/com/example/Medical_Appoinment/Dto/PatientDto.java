package com.example.Medical_Appoinment.Dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto {
	@NotNull

   private Long id;
   @NotEmpty(message = "Name cannot be empty")
   private String name;
   @NotEmpty(message = "Age cannot be empty")

   private int age;
   @NotEmpty(message = "Email cannot be empty")

   private String email;
   
}
