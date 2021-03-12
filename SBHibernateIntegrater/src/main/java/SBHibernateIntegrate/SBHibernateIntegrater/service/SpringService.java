package SBHibernateIntegrate.SBHibernateIntegrater.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SBHibernateIntegrate.SBHibernateIntegrater.dao.SpringDao;
import SBHibernateIntegrate.SBHibernateIntegrater.entity.Employee;


@Service
public class SpringService {
	
	@Autowired
	SpringDao springdao;
	
	public List<Employee> getAllEmployee(){
		
		List<Employee> list=springdao.getAllEmployee();
		return list;
	}

	public List<Employee> getAllEmployeebyID(int id) {
		
		List<Employee> list=springdao.getAllEmployeebyID(id);
		return list;
	}

	public boolean insertEmployee(Employee emp) {
		boolean result=springdao.insertEmployee(emp);
		
		return result;
	}

	public boolean updateEmployee(Employee emp) {
		
		boolean result=springdao.updateEmployee(emp);
		
		return result;
		
		
	}
	

}
