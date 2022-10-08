package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Patient;
import com.utility.patientutility;

public class DeleteDetails {
public static void main(String[] args) {
		
		SessionFactory sessionFactory = patientutility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Patient p = (Patient)session.load(Patient.class, 12);
		session.delete(p);
		
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();

}
}