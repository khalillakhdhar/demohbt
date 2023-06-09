package com.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "grade")
public class User {

	@Id
	private long identifiant;
	@Column(nullable = false)
	private String nomComplet;
	
	@Column(nullable = false)
	@Min(value = 18)
	private int age;
	
	private String adresse;
	@Column(nullable = false,length = 20)
	@Size(max = 20,min = 8) //validation
	private String tel;
	
}



