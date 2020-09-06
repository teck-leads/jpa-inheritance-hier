package com.techleads.app.runner;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.techleads.app.model.Employee;
import com.techleads.app.model.FullTimeEmployee;
import com.techleads.app.model.PartTimeEmployee;
import com.techleads.app.repository.EmployeeRepository;
@Component
public class EmployeeRunner implements CommandLineRunner{

	private Logger logger =LoggerFactory.getLogger(this.getClass());
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		logger.info("saving employee");
		Employee employee=new FullTimeEmployee("madhav", BigDecimal.valueOf(3000));
		employeeRepository.insertEmployee(employee);
		employee= new PartTimeEmployee("teja", BigDecimal.valueOf(5000));
		employeeRepository.insertEmployee(employee);
		/*
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("madhav", BigDecimal.valueOf(3000));
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee("teja", BigDecimal.valueOf(5000));
		employeeRepository.insertFullTimeEmployee(fullTimeEmployee);
		employeeRepository.insertPartTimeEmployee(partTimeEmployee);
		*/
		
		logger.info("saved employee");
		
		logger.info("All employees{}=> "+employeeRepository.findAll());
		
		//logger.info("All FullTimeEmployees{}=> "+employeeRepository.findAllFullTimeEmps());
		
		//logger.info("All PartTimeEmployees{}=> "+employeeRepository.findAllPartTimeEmps());
		
	}

}
