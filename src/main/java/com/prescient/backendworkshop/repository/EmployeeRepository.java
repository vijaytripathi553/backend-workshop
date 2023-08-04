package com.prescient.backendworkshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.prescient.backendworkshop.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
