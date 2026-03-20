package entities;

public class CurrencyConverter {

	public static double priceDollar; // preço do dollar
	public static double dollar; // quantos dollar vai converter
	public static double reais; // reais convertido
	public static final double tax = 6; // taxa de iof 6%

	 public static double  dollarExchangeRate() {
		return  priceDollar *dollar;
		
	}
	public static double tax() {
		return dollarExchangeRate() * tax /100;
	}

}
