package com.techleads.app.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Employee")
@Entity
//{}=> approach -1
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // everything is stored in one table
@DiscriminatorColumn(name = "EMP_TYP")

@MappedSuperclass
@SequenceGenerator(name = "emp_seq", initialValue = 2001, allocationSize = 1)
public abstract class Employee {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@Id
	private Integer id;
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

}
