package SBHibernateIntegrate.SBHibernateIntegrater.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import SBHibernateIntegrate.SBHibernateIntegrater.entity.Employee;

public class SpringConfiguration {

	public static SessionFactory getSession(){
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class);
		//cfg.configure.addAnnotatedClass(Employee.class);
		System.out.println("Read cfg file");
		SessionFactory factory=cfg.buildSessionFactory();
		
		return factory;
		
		
	}
	
	
}
