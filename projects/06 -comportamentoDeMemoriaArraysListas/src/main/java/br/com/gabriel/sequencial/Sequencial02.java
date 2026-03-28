package br.com.gabriel.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		x = Math.pow(x,2);
		double resu = 3.14159*x;
		System.out.printf("A = %.4f ",resu);
		sc.close();

	}

}
