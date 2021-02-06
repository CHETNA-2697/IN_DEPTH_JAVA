package com;

public class CurrencyConverter03 {
	double[] exchangeRates;
	void setExchangeRates(double[] rates) {
		exchangeRates=rates;
	}
	void updateExchangeRate(int arrayIndex, int newVal) {
		exchangeRates[arrayIndex]=newVal;
	}
	double getExhcnageRate(int arrayIndex) {
		return exchangeRates[arrayIndex];
	}
	double computeTransferAmount(int arrayIndex, double amount) {
	return 	amount*getExhcnageRate(arrayIndex);
	}
	void printCurrency() {
		System.out.println("One dollar = "+exchangeRates[0]+" Indian Rupee");
		System.out.println("One dollar = "+exchangeRates[1]+"  UAE dirham");
		System.out.println("One dollar = "+exchangeRates[2]+" Brazilian real");
		System.out.println("One dollar = "+exchangeRates[3]+" chilean peso");
		System.out.println("One dollar = "+exchangeRates[4]+" mexican peso");
		System.out.println("One dollar = "+exchangeRates[5]+" yen");
		System.out.println("One dollar = "+exchangeRates[6]+" Australian Dollar");
		System.out.println("Lenght of array :: "+exchangeRates.length);
	}

	public static void main(String[] args) {
		CurrencyConverter03 cc= new CurrencyConverter03();
		double[] rates={63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0}; //JAN1
		cc.setExchangeRates(rates);
		cc.printCurrency();
		rates=new double[] {66.0, 5.0, 3.0, 595.5, 18.0, 107.0, 2.0}; //JAN2
		cc.setExchangeRates(rates);
		cc.printCurrency();	
		cc.updateExchangeRate(0,68);
		cc.printCurrency();	
		double amount=cc.computeTransferAmount(3, 1000);
		System.out.println("transferred Amount :: "+amount);
		

		 
}}