package Inheritance;

import java.util.Date;

public class Patient extends Person {
	int patientNumber;
	String hospital;
	Date yearOfJoining = new Date();
	String address;
	float fees;
	
	public Patient(String name, String phone, String email, int patientNumber, String hospital, Date yearOfJoining,
			String address, float fees) {
		super(name, phone, email);
		this.patientNumber = patientNumber;
		this.hospital = hospital;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
		this.fees = fees;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public Date getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(Date yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getMedicalFee(Money m) {
		return m.getTotalFee(yearOfJoining);
	}
	@Override
	public String toString() {
		return "Patient [patientNumber=" + patientNumber + ", hospital=" + hospital + ", yearOfJoining=" + yearOfJoining
				+ ", address=" + address + ", fees=" + fees + "]";
	}}
