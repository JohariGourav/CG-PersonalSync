package com.capgemini.collectionClasses;

public class Television {
	private String company;
	private String type;
	private boolean threeDEnabled;
	private int price;

	public Television(String company, String type, boolean threeDEnabled, int price) {
		super();
		this.company = company;
		this.type = type;
		this.threeDEnabled = threeDEnabled;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public String getType() {
		return type;
	}

	public boolean isThreeDEnabled() {
		return threeDEnabled;
	}

	public int getPrice() {
		return price;
	}
}
