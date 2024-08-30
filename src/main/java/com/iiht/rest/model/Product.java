package com.iiht.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // setters and getters
@NoArgsConstructor // public Product(){} --> generates no aruguments constructor
@AllArgsConstructor
@Entity
@Table(name="Productable2")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long productId;
	
	private String description;
	private double price;
	
}
