package com.jay.taxcalc.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jay.taxcalc.beans.CountryEnums;
import com.jay.taxcalc.beans.CountryTaxStructure;
import com.jay.taxcalc.beans.TaxSlab;

public class TaxCalcUtility {

	private static Map<CountryEnums, CountryTaxStructure> countryTaxSalbsMap = null;

	static {
		countryTaxSalbsMap = new HashMap<>();

		List<TaxSlab> indiaTaxSlabs = new ArrayList<>();

		indiaTaxSlabs.add(new TaxSlab(0.0, 250000.0, 0.0));
		indiaTaxSlabs.add(new TaxSlab(250000.0, 500000.0, 10.0));
		indiaTaxSlabs.add(new TaxSlab(500000.0, 1000000.0, 20.0));
		indiaTaxSlabs.add(new TaxSlab(1000000.0, 10000000.0, 30.0));

		CountryTaxStructure indiaTaxStructure = new CountryTaxStructure(CountryEnums.INDIA, indiaTaxSlabs);

		List<TaxSlab> chinaTaxSlabs = new ArrayList<>();

		chinaTaxSlabs.add(new TaxSlab(0.0, 300000.0, 0.0));
		chinaTaxSlabs.add(new TaxSlab(300000.0, 500000.0, 8.0));
		chinaTaxSlabs.add(new TaxSlab(500000.0, 1000000.0, 15.0));
		chinaTaxSlabs.add(new TaxSlab(1000000.0, 10000000.0, 24.0));

		CountryTaxStructure chinaTaxStructure = new CountryTaxStructure(CountryEnums.CHINA, chinaTaxSlabs);

		countryTaxSalbsMap.put(CountryEnums.INDIA, indiaTaxStructure);
		countryTaxSalbsMap.put(CountryEnums.CHINA, chinaTaxStructure);
	}

	public static CountryTaxStructure getCountry(CountryEnums countryEnums) {
		return countryTaxSalbsMap.get(countryEnums);
	}
}
