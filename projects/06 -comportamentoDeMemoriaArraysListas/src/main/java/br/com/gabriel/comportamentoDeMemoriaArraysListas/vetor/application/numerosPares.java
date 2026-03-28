package br.com.gabriel.comportamentoDeMemoriaArraysListas.vetor.application;

import java.util.Scanner;

public class numerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros deseja digitar: ");
		
		int n = sc.nextInt();
		int[] pares = new int[n];
		for(int i = 0; i<pares.length;i++) {
			System.out.print("Digite um numero: ");
			pares[i] = sc.nextInt();	
		}
		int par = 0;
		System.out.println();
		System.out.print("Numeros pares:");
	
		for(int i = 0;i<pares.length;i++) {
			if(pares[i]%2 == 0) {
				System.out.print(" "+pares[i]);
				par+=1;
			}
			
		}
		System.out.println();
		System.out.print("Quantidade de pares: "+par);
		
		sc.close();

	}

}
