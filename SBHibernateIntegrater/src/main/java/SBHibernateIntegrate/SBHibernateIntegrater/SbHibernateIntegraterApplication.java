package SBHibernateIntegrate.SBHibernateIntegrater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan("SBHibernateIntegrate.SBHibernateIntegrater")
public class SbHibernateIntegraterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbHibernateIntegraterApplication.class, args);
	}

}
