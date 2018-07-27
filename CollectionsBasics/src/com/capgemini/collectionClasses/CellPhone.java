package com.capgemini.collectionClasses;

public class CellPhone {
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private int price;
	public CellPhone(String company, String model, String description, String operatingSystem, int price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
