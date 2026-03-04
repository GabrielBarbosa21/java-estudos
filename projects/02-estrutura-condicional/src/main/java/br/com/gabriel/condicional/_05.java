package br.com.gabriel.condicional;

import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBancon = 5.00;
		double torrada = 2.00;
		double refrigerante = 1.50;
		double valor;
		if(x == 1) {
			x = sc.nextInt();
			valor = cachorroQuente * x;
		}else if(x == 2) {
			x = sc.nextInt();
			valor = xSalada * x;
		}else if(x == 3) {
			x = sc.nextInt();
			valor = xBancon * x;
		}
		
		else if(x == 4) {
			x = sc.nextInt();
			valor = torrada*x;
		}else {
			x = sc.nextInt();
			valor = refrigerante*x; 
		}
			
		System.out.println("Total: R$ "+valor);
	
		
		
		sc.close();

	}

}
