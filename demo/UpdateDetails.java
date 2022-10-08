package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Patient;
import com.utility.patientutility;

public class UpdateDetails {
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = patientutility.getSessionFactory();	
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Patient p = (Patient)session.get(Patient.class,49);
		 p.setFees(32000);
		 p.setRegistrationDate(15/12/2022);
		 p.setDoctorId("as009");
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
}
}