package hbn;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;

//inserting into data table 'Employee'
public class EmployeeApp {
	public static void main(String args[]) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory =  cfg.buildSessionFactory();
		//open the connection with database.Session interface is used
		Session ssn = factory.openSession();
		Transaction tx = ssn.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpcode(102);
		emp.setEmpname("priyanka");
		emp.setSalary(200000);
		//save() is to execute the insert query 
		ssn.save(emp);
		tx.commit();
		//connection is closed with database
		ssn.close();
	}
}
