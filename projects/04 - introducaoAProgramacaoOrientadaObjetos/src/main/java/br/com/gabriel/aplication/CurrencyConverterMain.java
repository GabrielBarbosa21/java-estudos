package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class CurrencyConverterMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.priceDollar = sc.nextDouble();
		System.out.print("How many will be bought? ");
		CurrencyConverter.dollar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f",(CurrencyConverter.dollarExchangeRate()+CurrencyConverter.tax()));
		
		
		
		sc.close();

	}

}
