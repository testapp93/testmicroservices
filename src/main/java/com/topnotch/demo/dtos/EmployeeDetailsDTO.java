package com.topnotch.demo.dtos;

import java.io.Serializable;

public class EmployeeDetailsDTO implements Serializable {
	
	private String first_name ;
	
	private String last_name ;
	
	private String department ;
	
	private String expertise ;
	
	private String email ;
	
	public EmployeeDetailsDTO() { super() ;	}

	public EmployeeDetailsDTO(String first_name, String last_name, String department, String expertise, String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.department = department;
		this.expertise = expertise;
		this.email = email;
	}
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
