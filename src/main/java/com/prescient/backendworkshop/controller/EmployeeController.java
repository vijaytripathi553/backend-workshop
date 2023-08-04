package com.prescient.backendworkshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prescient.backendworkshop.service.EmployeeService;
import com.prescient.backendworkshop.vo.EmployeeVO;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeService  employeeService;
	
	
	@PostMapping("addUpdate")
	public EmployeeVO addUpdate(@RequestBody EmployeeVO e)
	{
		return employeeService.addUpdate(e);
	}
	
	
	@GetMapping("list")
	public List<EmployeeVO> displayAll()
	{
		return employeeService.displayAll();
		
	}
	
	
	@DeleteMapping("delete/{id}")
	public Long delete(@PathVariable Long id)
	{
		return employeeService.delete(id);
	}

}
