package com;

public class CurrencyConverter {
	int rupee = 63;
	int dirham = 3; // UAE
	int real = 3;  // Brazilian     
	int chilean_peso = 595;
	int mexican_peso = 18;       
	int _yen = 107;
	int $australian = 2;  // Australian dollar
	int dollar;
	int Rupee = 63;
	void printCurrency()
	{
		System.out.println("One dollar = "+Rupee+" Indian Rupee");
		System.out.println("One dollar = "+dirham+"  UAE dirham");
		System.out.println("One dollar = "+real+" Brazilian real");
		System.out.println("One dollar = "+chilean_peso+" chilean peso");
		System.out.println("One dollar = "+mexican_peso+" mexican peso");
		System.out.println("One dollar = "+_yen+" yen");
		System.out.println("One dollar = "+$australian+" Australian Dollar");
	}
	public static void main(String[] args)
	{
		CurrencyConverter cc = new CurrencyConverter();
		cc.printCurrency();
		
	}

} 

