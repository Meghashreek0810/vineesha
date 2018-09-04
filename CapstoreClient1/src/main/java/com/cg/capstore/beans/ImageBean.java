package com.cg.capstore.beans;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ImageBean {
	
	
	private String imageId;
	
	
	private byte[] imageData;
	
	private String imageName;
	
	private String imageType;
	private String imagePath;
	
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	
	
	public byte[] getImageData() {
		return imageData;
	}
	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	
	public ImageBean(String imageId, byte[] imageData, String imageName, String imageType, String imagePath) {
		super();
		this.imageId = imageId;
		this.imageData = imageData;
		this.imageName = imageName;
		this.imageType = imageType;
		this.imagePath = imagePath;
	}
	public ImageBean() {
		super();
	}
	
}
