package com.example.Medical_Appoinment.Entity;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctors")
public class Doctor {
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY )
		private Long id;
	   @Column(nullable = false)
		private String docName;
	   @Column(nullable = false)

		private String specialization;
	   @Column(nullable = false)

		private Time availableTime;
}
