package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.Patient;
import com.utility.patientutility;

public class ViewDetails {
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = patientutility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Query<Patient> query1=session.createQuery("from Patient");
	         
	        List<Patient> result=query1.list();
	         
	         
	       Patient[] view = null;
		for(Patient p:view)
	      {
	       	System.out.println(p.getName());
	    	System.out.println(p.getMobileNo());
	    	System.out.println(p.getPid());
	    	System.out.println(p.getRegistrationDate());
	       	System.out.println(p.getAddress()); 
	       	System.out.println(p.getAdharNo());
	       	System.out.println(p.getBloodGroup());
	    	System.out.println(p.getBirthdate());
	    	System.out.println(p.getCity());
	    	System.out.println(p.getState());
	    	System.out.println(p.getChronicDiseases());
	    	System.out.println(p.getCountry());
	    	System.out.println(p.getDoctorId());
	    	System.out.println(p.getEmailID());
	    	System.out.println(p.getGender());
	    	System.out.println(p.getMedicineAllergy());
	    	System.out.println(p.getFees());
	    	System.out.println(p.getMobileNo());

	         }

		  
		  
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

	}
}
