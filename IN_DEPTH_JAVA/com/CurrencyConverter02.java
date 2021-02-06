package com;

public class CurrencyConverter02 {
	double[] exchangeRate = new double[] {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
	void printCurrency() {
		System.out.println("One dollar = "+exchangeRate[0]+" Indian Rupee");
		System.out.println("One dollar = "+exchangeRate[1]+"  UAE dirham");
		System.out.println("One dollar = "+exchangeRate[2]+" Brazilian real");
		System.out.println("One dollar = "+exchangeRate[3]+" chilean peso");
		System.out.println("One dollar = "+exchangeRate[4]+" mexican peso");
		System.out.println("One dollar = "+exchangeRate[5]+" yen");
		System.out.println("One dollar = "+exchangeRate[6]+" Australian Dollar");
		System.out.println("Lenght of array :: "+exchangeRate.length);
	}

	public static void main(String[] args) {
		CurrencyConverter02 cc= new CurrencyConverter02();
		cc.printCurrency();
}}