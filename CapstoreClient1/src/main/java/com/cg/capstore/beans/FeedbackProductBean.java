package com.cg.capstore.beans;



import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class FeedbackProductBean {

	@Override
	public String toString() {
		return "FeedbackProductBean [feedbackId=" + feedbackId + ", feedbackTitle=" + feedbackTitle + ", date=" + date
				+ ", rating=" + rating + ", feedbackDescription=" + feedbackDescription + "]";
	}

	public FeedbackProductBean(Integer feedbackId, String feedbackTitle, Date date, Integer rating,
			String feedbackDescription) {
		super();
		this.feedbackId = feedbackId;
		this.feedbackTitle = feedbackTitle;
		this.date = date;
		this.rating = rating;
		this.feedbackDescription = feedbackDescription;
	}

	private Integer feedbackId;
	private String feedbackTitle;
	private Date date;
	private Integer rating;
	
	private String feedbackDescription;
	
	
	
	
	public String getFeedbackDescription() {
		return feedbackDescription;
	}
	
	public void setFeedbackDescription(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getFeedbackTitle() {
		return feedbackTitle;
	}
	public void setFeedbackTitle(String feedbackTitle) {
		this.feedbackTitle = feedbackTitle;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public FeedbackProductBean() {
		super();
	}
	

}
