package com.prescient.backendworkshop.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.prescient.backendworkshop.entity.Employee;
import com.prescient.backendworkshop.vo.EmployeeVO;
@Repository
public interface EmployeeService {
	//Insert
	public EmployeeVO addUpdate(EmployeeVO e);
	//Display
	public List<EmployeeVO> displayAll();
	
	//Delete
	public Long delete(Long id);
		
	
	

}
