package com.cg.capstore.beans;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class WishlistBean {
	
	public WishlistBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WishlistBean(String wishlistId, List<ProductBean> product) {
		super();
		this.wishlistId = wishlistId;
		this.product = product;
	}

	private String wishlistId;
	
	private List<ProductBean> product;

	public String getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(String wishlistId) {
		this.wishlistId = wishlistId;
	}

	public List<ProductBean> getProduct() {
		return product;
	}

	public void setProduct(List<ProductBean> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "WishlistBean [wishlistId=" + wishlistId + ", product=" + product + "]";
	}

	
	
}
















