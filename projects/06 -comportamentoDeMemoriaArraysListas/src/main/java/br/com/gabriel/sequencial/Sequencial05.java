package br.com.gabriel.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1,num1 ;
		double prec1;
		int cod2,num2;
		double prec2;
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		prec1 = sc.nextDouble();
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		prec2 = sc.nextDouble();
		
		double valor = num1 * prec1 + num2 * prec2;
		System.out.printf("VALOR A PAGAR: R$%.2f" , valor);
		
		
		
		
		sc.close();

	}

}
