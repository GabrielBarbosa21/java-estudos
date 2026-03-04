package br.com.gabriel.condicional;

import java.util.Locale;
import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		if (x <= 25.00 && x > 0.00) {
			System.out.println("Intervalo [0,25]");
		}else if(x >= 25.00 && x <=50.75) {
			System.out.println("Intervalo [25,50]");
		}else if(x >= 50.76 && x  < 100.01) {
			System.out.println("Intervalo [75,100]");
		}else {
			System.out.println("fora do intervalo");
		}
		
		
		
		sc.close();

	}

}
