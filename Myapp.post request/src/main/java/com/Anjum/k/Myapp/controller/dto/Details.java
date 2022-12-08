package com.Anjum.k.Myapp.controller.dto;

public class Details {
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String cnfPassword;
	private String number;
	
	public Details() {
		System.out.println("Default constructor()");
	}

	
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCnfPassword() {
		return cnfPassword;
	}

	public void setCnfPassword(String cnfPassword) {
		this.cnfPassword = cnfPassword;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "Details [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password="
				+ password + ", cnfPassword=" + cnfPassword + ", number=" + number + "]";
	}

	
	
	
	

}
