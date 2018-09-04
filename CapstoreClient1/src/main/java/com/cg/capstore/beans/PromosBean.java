package com.cg.capstore.beans;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PromosBean {

	public PromosBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PromosBean(String promoCode, Integer discount, LocalDateTime timePeriod) {
		super();
		this.promoCode = promoCode;
		this.discount = discount;
		this.timePeriod = timePeriod;
	}
	private String promoCode;
	private Integer discount;
	private LocalDateTime timePeriod;
	
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public LocalDateTime getTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(LocalDateTime timePeriod) {
		this.timePeriod = timePeriod;
	}

}