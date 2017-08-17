package com.jay.taxcalc.beans;

public class TaxSlab {

	private double lowerRange;
	private double upperRange;
	private double taxPercentage;

	public TaxSlab(double lowerRange, double upperRange, double taxPercentage) {
		super();
		this.lowerRange = lowerRange;
		this.upperRange = upperRange;
		this.taxPercentage = taxPercentage;
	}

	public double getLowerRange() {
		return lowerRange;
	}

	public double getUpperRange() {
		return upperRange;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

}
