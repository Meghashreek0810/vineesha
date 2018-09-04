package com.cg.capstore.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class AdminBean {
	
	public AdminBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminBean(String emailId, String password) {
		super();
		this.emailId = emailId;
		Password = password;
	}
	private String emailId;
	
	private String Password;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Admin [emailId=" + emailId + ", Password=" + Password + "]";
	}
	
	
	
}