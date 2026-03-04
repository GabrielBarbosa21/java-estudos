package br.com.gabriel.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int func = sc.nextInt();
		int horas = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salary = horas * valorHora;
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f",func,salary);
		
		
		
		sc.close();

	}

}
