package br.com.gabriel.repetitivas;

import java.util.Scanner;

public class repetitivasWhile01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		
		int x = sc.nextInt();
		int senha = 2002;
		
		while(x != senha) {
			System.out.println("Senha Invalida!");
			System.out.print("Digite novamente:  ");
			x = sc.nextInt();
			
		}
		System.out.println("Hello word");
		
	sc.close();

	}

}
