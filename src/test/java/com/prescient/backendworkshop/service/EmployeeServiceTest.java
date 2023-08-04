package com.prescient.backendworkshop.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.prescient.backendworkshop.entity.Employee;
import com.prescient.backendworkshop.repository.EmployeeRepository;
import com.prescient.backendworkshop.vo.EmployeeVO;

@SpringBootTest       // This annotations tells to framework that this class is going to be tested in unit testing framework
class EmployeeServiceTest {
	@InjectMocks
	private EmployeeService  employeeService;
	
	
	@Mock
	private EmployeeRepository employeeRepository;

	@Test    // If you do not specify this annotation then your method won't be tested
	public void Should_Insert_Record()
	{
		// Create  an object of entity class
		
		EmployeeVO empVO=new EmployeeVO();
		empVO.setId((long) 1);
		empVO.setFirstName("Vijay");
		empVO.setLastName("Tripathi");
		empVO.setDesignation("Manager");
		empVO.setSalary((long) 568952);
		empVO.setIsActive(true);
		empVO.setCreatedOn(new Date());
		
		//Mockito.when(employeeRepository.save(EmployeeVO.class)).thenReturn(empVO);
		
		// Save the contact
		EmployeeVO newContact=employeeService.addUpdate(empVO);
		
		//Verify the save
		
		assertEquals("Vijay", newContact.getFirstName());
		
		
		//assertThat(employeeService.addUpdate(empVO)).isEqualTo(empVO);
		
		
	}

}
