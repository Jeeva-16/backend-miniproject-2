package com.example.Medical_Appoinment.Dto;

import java.sql.Time;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {
	@NotNull

  private Long id;
  @NotEmpty(message = "Name cannot be empty")

  private String docName;
  @NotEmpty(message = "Specialization cannot be empty")

  private String specialization;
  @NotEmpty(message = "Time cannot be empty")

  private Time availableTime;
  
}
