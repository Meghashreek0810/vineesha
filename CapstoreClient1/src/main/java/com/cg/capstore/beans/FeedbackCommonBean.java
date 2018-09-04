package com.cg.capstore.beans;



import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class FeedbackCommonBean {
	public FeedbackCommonBean(String id, MerchantBean merchant, CustomerBean customer, String comments, Date date) {
		super();
		this.id = id;
		this.merchant = merchant;
		this.customer = customer;
		this.comments = comments;
		this.date = date;
	}


	private String id;
	
	private MerchantBean merchant;
	
	private CustomerBean customer;
	
	private String comments;
	
	private Date date;
	
	
	public FeedbackCommonBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public MerchantBean getMerchant() {
		return merchant;
	}


	public void setMerchant(MerchantBean merchant) {
		this.merchant = merchant;
	}


	public CustomerBean getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerBean customer) {
		this.customer = customer;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "FeedbackCommonBean [id=" + id + ", merchant=" + merchant + ", customer=" + customer + ", comments="
				+ comments + ", date=" + date + "]";
	}
	
	
}