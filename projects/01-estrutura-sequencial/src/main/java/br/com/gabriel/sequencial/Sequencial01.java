package br.com.gabriel.sequencial;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = x+y;
		System.out.println("Soma =" +soma);
		sc.close();

	}

}
