package br.com.gabriel.repetitivas;

import java.util.Scanner;

public class repetitivasFor06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <=n;i++) {
			int divisor = n%i;
			if(divisor == 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();

	}

}
