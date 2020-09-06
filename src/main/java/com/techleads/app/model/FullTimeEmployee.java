package com.techleads.app.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class FullTimeEmployee extends Employee {

	private BigDecimal salary;

	public FullTimeEmployee(String name, BigDecimal salary) {
		super(name);
		this.salary = salary;
	}
	
	

}
