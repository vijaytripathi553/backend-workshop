package com.prescient.backendworkshop.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prescient.backendworkshop.entity.Employee;
import com.prescient.backendworkshop.service.EmployeeService;


@WebMvcTest(EmployeeControllerTest.class)
class EmployeeControllerTest {
	@Autowired
	MockMvc mockMvc;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@MockBean
	EmployeeService employeeService;
	
	@MockBean
	Employee employee;
	
	
	
	
	

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
