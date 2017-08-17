package com.jay.taxcalc.beans;

import java.util.List;

public class CountryTaxStructure {

	private CountryEnums countryCode;
	private List<TaxSlab> taxSlabs = null;

	public CountryTaxStructure(CountryEnums countryCode, List<TaxSlab> taxSlabs) {
		this.countryCode = countryCode;
		this.taxSlabs = taxSlabs;
	}

	public CountryEnums getCountryCode() {
		return countryCode;
	}

	public List<TaxSlab> getTaxSlabs() {
		return taxSlabs;
	}

}
