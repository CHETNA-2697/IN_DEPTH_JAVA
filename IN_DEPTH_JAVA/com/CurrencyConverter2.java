package com;
public class CurrencyConverter2
{
	double[] exchangeRates = new double [] {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
		
	void setExchangeRates(double[] rates) {
				exchangeRates = rates;
		}
	void updateExchangeRate(int countryIndex, double newVal) {
			exchangeRates[countryIndex] = newVal;
		}
	double getExchangeRate(int countryIndex) {
			return exchangeRates[countryIndex];
		}
	double computeTransferAmount(int countryIndex, double amount) {
			double finalAmount = amount * getExchangeRate(countryIndex);
			return finalAmount; 
	}     
	double transferFee(int countryIndex, double amount) {
			double transferFee = computeTransferAmount(countryIndex, amount) * 0.02;
			return transferFee;
	}
        void printCurrencies() {
         System.out.println("\nrupee: " + exchangeRates[0]);
         System.out.println("dirham: " + exchangeRates[1]);
         System.out.println("real: " + exchangeRates[2]);
         System.out.println("chilean_peso: " + exchangeRates[3]);
         System.out.println("mexican_peso: " + exchangeRates[4]);
         System.out.println("_yen: " + exchangeRates[5]);
         System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]);
        }
public static void main(String[] args) {
		CurrencyConverter2 cc=new CurrencyConverter2();
		double amount = cc.computeTransferAmount(0, 5000);
		double amount1 = cc.transferFee(0, 5000);		
		System.out.println("\nTransferred amount: " + amount);
		System.out.println("\nTransferred fee: " + amount1);
		cc.printCurrencies();

        }

    }



