package com.example.Medical_Appoinment.Entity;

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
@Table(name = "medications")
public class Medication {
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY )
		private Long id;
	   @Column(nullable = false)
		private String medicineName;
	   @Column(nullable = false)

		private String dozage;
	   @Column(nullable = false)

		private int price;
}
