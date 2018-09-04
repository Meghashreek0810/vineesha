package com.cg.capstore.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductBean {

	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductBean(String productId, String productName, Double price, List<MerchantBean> merchant, Double quantity,
			String category, PromosBean promoCode, DiscountBean discount, List<ImageBean> imageId,
			List<FeedbackProductBean> feedbackProduct, List<ImageBean> image) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.merchant = merchant;
		this.quantity = quantity;
		this.category = category;
		this.promoCode = promoCode;
		this.discount = discount;
		this.image = image;
		this.feedbackProduct = feedbackProduct;
	}
	private String productId;
	private String productName;
	private Double price;
	
	private List<MerchantBean> merchant;
	private Double quantity;
	private String category;
	
	private PromosBean promoCode;
	private DiscountBean discount;
	
	private List<ImageBean> image;
	
	private List<FeedbackProductBean> feedbackProduct;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public List<MerchantBean> getMerchant() {
		return merchant;
	}
	public void setMerchant(List<MerchantBean> merchant) {
		this.merchant = merchant;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public PromosBean getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(PromosBean promoCode) {
		this.promoCode = promoCode;
	}
	public DiscountBean getDiscount() {
		return discount;
	}
	public void setDiscount(DiscountBean discount) {
		this.discount = discount;
	}
	public List<ImageBean> getImage() {
		return image;
	}
	public void setImage(List<ImageBean> image) {
		this.image = image;
	}
	public List<FeedbackProductBean> getFeedbackProduct() {
		return feedbackProduct;
	}
	public void setFeedbackProduct(List<FeedbackProductBean> feedbackProduct) {
		this.feedbackProduct = feedbackProduct;
	}
	

	
}
