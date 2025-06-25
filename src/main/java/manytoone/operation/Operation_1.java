package manytoone.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import manytoone.entity.Department1;
import manytoone.entity.Employee2;

public class Operation_1 {

	private static Configuration configuration=null;
	private static SessionFactory factory=null;
	private static Session session=null;
	private static Transaction transaction=null;
	
	public static void opensession() {
		configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee2.class);
		configuration.addAnnotatedClass(Department1.class);
		factory=configuration.buildSessionFactory();
		session=factory.openSession();
		session.beginTransaction();
		transaction=session.getTransaction();
	}
	
	  public static void closesession() {
	    	transaction.commit();
			session.close();
		}
	  
	  public static void insertData() {
		  opensession();
		  Department1 department1=new Department1("Developing");
		  Department1 department2=new Department1("HR");
		  Department1 department3=new Department1("Testing");
		  Department1 department4=new Department1("Account");
		  
		  Employee2 employee2=new Employee2("rohan");
		  employee2.setDepartment1(department2);
		  session.persist(department1);
		  session.persist(department2);
		  session.persist(department3);
		  session.persist(department4);
		  session.persist(employee2);
		  closesession();
	  }
}
