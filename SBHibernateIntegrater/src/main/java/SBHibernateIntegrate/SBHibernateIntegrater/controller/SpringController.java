package SBHibernateIntegrate.SBHibernateIntegrater.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import SBHibernateIntegrate.SBHibernateIntegrater.entity.Employee;
import SBHibernateIntegrate.SBHibernateIntegrater.service.SpringService;
@RestController
public class SpringController {
	
		
	@Autowired
	SpringService springservice;
	
	@GetMapping("employeelist")
	public List<Employee> getAllEmployee(){
		
		System.out.println("Student added");
		List<Employee> list=springservice.getAllEmployee();
		return list;
		
	}
	
	@GetMapping("getemployeebyid/{id}")
	public List<Employee> getEmployeebyID(@PathVariable int id){
		
		
		List<Employee> list=springservice.getAllEmployeebyID(id);
		return list;
		
	}
	
	@PostMapping("insertemployee")
	public String insertEmloyeeby(@RequestBody Employee emp ){
		
		boolean result=springservice.insertEmployee(emp);
		
		if(result) {
			
			return "Employee added successfully";
		}
		else
		return "Error";
		
	}
	
	@PutMapping("updateemployee")
	public String updateEmployee(@RequestBody Employee emp) {
		
		boolean result=springservice.updateEmployee(emp);
		
		if(result) {
			
			return "Employee updated successfully";
		}
		else
		return "Error";	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
