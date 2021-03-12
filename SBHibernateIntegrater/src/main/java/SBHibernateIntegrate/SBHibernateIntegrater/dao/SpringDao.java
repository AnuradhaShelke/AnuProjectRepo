package SBHibernateIntegrate.SBHibernateIntegrater.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import SBHibernateIntegrate.SBHibernateIntegrater.config.SpringConfiguration;
import SBHibernateIntegrate.SBHibernateIntegrater.entity.Employee;
@Repository
public class SpringDao {
	
	
	
	SessionFactory factory=SpringConfiguration.getSession();
	public List<Employee> getAllEmployee(){
		
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> emplist=criteria.list();
		
		return emplist;
		
	}
	public List<Employee> getAllEmployeebyID(int id) {
		
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.eqOrIsNull("id", id));
		List<Employee> list=criteria.list();
		return list;
	}
	public boolean insertEmployee(Employee emp) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(emp);
		tx.commit();
		
		
		return true;
		
	}
	public boolean updateEmployee(Employee emp) {
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(emp);
		tx.commit();		
		return true;
		
		
		
	}

}
