package com.prescient.backendworkshop.service.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prescient.backendworkshop.entity.Employee;
import com.prescient.backendworkshop.repository.EmployeeRepository;
import com.prescient.backendworkshop.service.EmployeeService;
import com.prescient.backendworkshop.vo.EmployeeVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	//AddUpdate
	public EmployeeVO addUpdate(EmployeeVO e) {
		
		Employee r=this.getEmployee(e);
		 r=employeeRepository.save(r);

		return this.getEmployeeVO(r);
	}
	
	
	private EmployeeVO getEmployeeVO(Employee e) {
		if(e!=null)
		{
			EmployeeVO tt=new EmployeeVO();
			tt.setId(e.getId());
			tt.setFirstName(e.getFirstName());
			tt.setLastName(e.getLastName());
			tt.setDesignation(e.getDesignation());
			tt.setSalary(e.getSalary());
			tt.setIsActive(e.getIsActive());
			tt.setCreatedOn(e.getCreatedOn());
			return tt;
			
		}
		return null;
	}


	//  Developing getEmployee()
	private Employee getEmployee(EmployeeVO e) {
		Employee t=null;
		if(e!=null)
		{
			
			
			if(e.getId() !=null)
			{
				Optional<Employee> k=employeeRepository.findById(e.getId());
				
				if(k.isPresent())
				{
					t=k.get();
				}
				else
				{
					// Exception	
				}
			}
			else
			{
				t=new Employee();
				t.setId(e.getId());
				t.setIsActive(true);
				t.setCreatedOn(new Date());
			}
			
			t.setFirstName(e.getFirstName());
			t.setLastName(e.getLastName());
			t.setDesignation(e.getDesignation());
			t.setSalary(e.getSalary());
			
			
			return t;	
		}
		
	// End of getEmployee Method
		return null;
	}


	@Override
	public List<EmployeeVO> displayAll() {
		
		List<Employee> eld=(List<Employee>) employeeRepository.findAll();
		List<EmployeeVO> temp=new ArrayList<>();
		for(Employee ee:eld)
		{	
			
			EmployeeVO vo=new EmployeeVO();
			vo.setId(ee.getId());
			vo.setFirstName(ee.getFirstName());
			vo.setLastName(ee.getLastName());
			vo.setDesignation(ee.getDesignation());
			vo.setSalary(ee.getSalary());
			vo.setIsActive(ee.getIsActive());
			vo.setCreatedOn(ee.getCreatedOn());
			temp.add(vo);
		}
		return temp;
	}


	@Override
	public Long delete(Long id) {
		employeeRepository.deleteById(id);
		return id;
	}
	
	
	
	
	
	

}
