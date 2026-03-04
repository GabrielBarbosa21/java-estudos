package br.com.gabriel.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double tri = A*C/2;
		double cir = Math.pow(C, 2)*3.14159;
		double trap = (A + B) * C /2;
		double quad = Math.pow(B, 2);
		double retan = A*B;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",tri,cir,trap,quad,retan);
		
		
		
		sc.close();

	}

}
