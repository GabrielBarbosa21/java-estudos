package br.com.gabriel.repetitivas;

import java.util.Scanner;

public class repetitivasFor05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int fatorial = 1;
		
		for(int i = 1;i<N;i++ ) {
			
			fatorial *= i;
			
			
		}
		System.out.println(fatorial);
		
		sc.close();

	}

}
