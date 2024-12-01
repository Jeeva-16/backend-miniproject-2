package com.example.Medical_Appoinment.Dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicationDto {
	@NotNull
   private long id;
   @NotEmpty(message = "Name cannot be empty")

   private String medicineName;
   @NotEmpty(message = "Dozage cannot be empty")

   private String dozage;
   @NotEmpty(message = "Price cannot be empty")

   private int price;
   
}
