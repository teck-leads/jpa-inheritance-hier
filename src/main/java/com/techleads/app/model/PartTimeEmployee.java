package com.techleads.app.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class PartTimeEmployee extends Employee {

	private BigDecimal hourlyWage;

	public PartTimeEmployee(String name, BigDecimal hourlyWage) {
		super(name);
		this.hourlyWage = hourlyWage;
	}

}
