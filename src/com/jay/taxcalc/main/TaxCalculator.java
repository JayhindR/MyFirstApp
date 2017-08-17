package com.jay.taxcalc.main;

import java.util.List;

import com.jay.taxcalc.beans.CountryEnums;
import com.jay.taxcalc.beans.CountryTaxStructure;
import com.jay.taxcalc.beans.TaxSlab;
import com.jay.taxcalc.utils.TaxCalcUtility;

public class TaxCalculator {
	public static double calculateTax(CountryEnums countryEnums, double ctc) {
		double tax = 0.0;

		CountryTaxStructure countryTaxStructure = TaxCalcUtility.getCountry(countryEnums);

		List<TaxSlab> taxSlabs = countryTaxStructure.getTaxSlabs();

		for (TaxSlab taxSlab : taxSlabs) {

			if (taxSlab.getLowerRange() < ctc) {
				if (taxSlab.getUpperRange() < ctc) {
					tax = tax + (taxSlab.getUpperRange() - taxSlab.getLowerRange()) * taxSlab.getTaxPercentage() / 100;
				} else {
					tax = tax + (ctc - taxSlab.getLowerRange()) * taxSlab.getTaxPercentage() / 100;
				}
			} else {
				break;
			}
		}
		System.out.println("Total tax on " + ctc + " in " + countryEnums.getCountryName() + " is : " + tax);
		return tax;
	}

	public static void main(String[] args) {
		TaxCalculator.calculateTax(CountryEnums.INDIA, 1000000.0);
		TaxCalculator.calculateTax(CountryEnums.CHINA, 1250000.0);
	}
	
	public void test() {
		System.out.println("Test");
	}
}
