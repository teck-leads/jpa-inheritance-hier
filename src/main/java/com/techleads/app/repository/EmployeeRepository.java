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

}
