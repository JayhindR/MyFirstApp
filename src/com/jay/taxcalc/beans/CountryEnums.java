package com.jay.taxcalc.beans;

public enum CountryEnums {
	INDIA(1, "India"), CHINA(2, "China"), US(3, "USA"), JAPAN(4, "Japan"), UK(5, "United Kingdom");

	CountryEnums(int countryCode, String countryName) {
		this.countryName = countryName;
		this.countryCode = countryCode;
	}

	private int countryCode;
	public int getCountryCode() {
		return countryCode;
	}
	public String getCountryName() {
		return countryName;
	}

	private String countryName;
}
