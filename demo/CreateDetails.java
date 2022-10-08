package com.demo;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.entity.Patient;
import com.utility.patientutility;

public class CreateDetails {
	public static void main(String[]args)
	{
		  SessionFactory sessionFactory = patientutility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  LocalDate Check_in=LocalDate.now() ;
	      LocalDate Check_out=LocalDate.now() ;
	      
	      Patient p=new Patient();
	      
	      p.setDoctorId("ss01");
	      p.setFees(28000);
	      p.setRegistrationDate(13/11/2022);
	      
	      Employee e=new Employee();
	      e.setStatus(5);
	      session.save(p);

	         session.save(e);
	         
	         
	         
			  System.out.println("Inserted Successfully");
			  session.getTransaction().commit();
			  session.close();
			  sessionFactory.close();
	      
	      
}
}