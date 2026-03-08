package br.com.gabriel.repetitivas;

import java.util.Scanner;

public class repetitivasFor07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			
			int quadrado = i*i;
			int cubo = i*quadrado;
			
			
			System.out.printf("%d %d %d%n",i,quadrado,cubo);
		}
		
		sc.close();

	}

}
