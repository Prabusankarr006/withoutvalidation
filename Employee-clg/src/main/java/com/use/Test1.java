package com.use;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test1 {

	public static void main(String[]args)
	{
		Employee s1=new Employee("Prabu",10000);
		Employee s2=new Employee("Sankar",9950);
		Transaction tr=null;
		try(Session ses=Employeeutil.getSessionFactory().openSession()){
			tr=ses.beginTransaction();  
			
			ses.persist(s1);
			ses.persist(s2);
			tr.commit(); 
		}
		catch(Exception e) {}
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getSalary());
		System.out.println(s2.getId()+" "+s2.getName()+" "+s2.getSalary());
	
	}
	
}

