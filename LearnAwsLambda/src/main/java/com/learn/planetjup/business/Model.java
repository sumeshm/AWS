package com.learn.planetjup.business;

public class Model {
	int year;
	String variant;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	@Override
	public String toString() {
		return "Car [ {year=/'" + year + "/', variant=/'" + variant + "} ]";
	}
}
