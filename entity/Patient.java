package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Patient {
	@Id
	@GenericGenerator(name = "patientId", strategy = "com.project.dao.receptionist.PatientIdGenerator")
	@GeneratedValue(generator = "patientId") //to generate auto incremented custom values for column
	private String pid;
	
	private int registrationDate;
	private String name;
	private String birthdate;
	private String gender;
	
	@Column(unique=true)
	private String emailID;	//optional
	
	@Column(unique=true)
	private long mobileNo;	
	
	@Column(unique=true)
	private long adharNo;
	
	private String country;
	private String state;
	private String city;
	
	private String Address;
	
	private String bloodGroup;
	private String chronicDiseases;
	private String medicineAllergy;	
	private String doctorId;
	private int fees;
	
	public Patient(){}
	
	public Patient(String name, String birthdate, String gender, String emailID, long mobileNo,
			long adharNo, String country, String state, String city, String address, String bloodGroup,
			String chronicDiseases, String medicineAllergy, String doctorId ,int fees) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.emailID = emailID;
		this.mobileNo = mobileNo;
		this.adharNo = adharNo;
		this.country = country;
		this.state = state;
		this.city = city;
		this.Address = address;
		this.bloodGroup = bloodGroup;
		this.chronicDiseases = chronicDiseases;
		this.medicineAllergy = medicineAllergy;
		this.doctorId = doctorId;
		this.fees=fees;
	}
	
	public void setRegistrationDate(int registrationDate) {
		this.registrationDate = registrationDate;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public int getRegistrationDate() {
		return registrationDate;
	}
	public String getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public String getGender() {
		return gender;
	}
	public String getEmailID() {
		return emailID;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public String getCountry() {
		return country;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getAddress() {
		return Address;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public String getChronicDiseases() {
		return chronicDiseases;
	}
	public String getMedicineAllergy() {
		return medicineAllergy;
	}
	public String getDoctorId() {
		return doctorId;
	}
	

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", registrationDate=" + registrationDate + ", name=" + name + ", birthdate="
				+ birthdate + ", gender=" + gender + ", emailID=" + emailID + ", mobileNo=" + mobileNo + ", adharNo="
				+ adharNo + ", country=" + country + ", state=" + state + ", city=" + city + ", Address=" + Address
				+ ", bloodGroup=" + bloodGroup + ", chronicDiseases=" + chronicDiseases + ", medicineAllergy="
				+ medicineAllergy + ", doctorId=" + doctorId + ", fees=" + fees + "]";
	}

	

	

}
