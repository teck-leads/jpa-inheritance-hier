package com.techleads.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techleads.app.model.Employee;
import com.techleads.app.model.FullTimeEmployee;
import com.techleads.app.model.PartTimeEmployee;

@Repository
@Transactional
public class EmployeeRepository {
	@Autowired
	private EntityManager entityManager;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	public void insertEmployee(Employee employee) {
		logger.info("inside " + this.getClass());
		entityManager.persist(employee);
		logger.info("existing from " + this.getClass());
	}
	

	
	public List<Employee> findAll() {
		logger.info("inside " + this.getClass());
		TypedQuery<Employee> createQuery = entityManager.createQuery("select e from Employee e", Employee.class);
		List<Employee> employees = createQuery.getResultList();

		logger.info("existing from " + this.getClass());
		return employees;
	}
	
	
	public void insertFullTimeEmployee(FullTimeEmployee employee) {
		logger.info("inside " + this.getClass());
		entityManager.persist(employee);
		logger.info("existing from " + this.getClass());
	}
	
	public void insertPartTimeEmployee(PartTimeEmployee employee) {
		logger.info("inside " + this.getClass());
		entityManager.persist(employee);
		logger.info("existing from " + this.getClass());
	}
	public List<FullTimeEmployee> findAllFullTimeEmps() {
		logger.info("inside " + this.getClass());
		TypedQuery<FullTimeEmployee> createQuery = entityManager.createQuery("select e from FullTimeEmployee e", FullTimeEmployee.class);
		List<FullTimeEmployee> fullTimeemployees = createQuery.getResultList();

		logger.info("existing from " + this.getClass());
		return fullTimeemployees;
	}
	
	public List<PartTimeEmployee> findAllPartTimeEmps() {
		logger.info("inside " + this.getClass());
		TypedQuery<PartTimeEmployee> createQuery = entityManager.createQuery("select e from PartTimeEmployee e", PartTimeEmployee.class);
		List<PartTimeEmployee> partTimeemployees = createQuery.getResultList();

		logger.info("existing from " + this.getClass());
		return partTimeemployees;
	}

}
