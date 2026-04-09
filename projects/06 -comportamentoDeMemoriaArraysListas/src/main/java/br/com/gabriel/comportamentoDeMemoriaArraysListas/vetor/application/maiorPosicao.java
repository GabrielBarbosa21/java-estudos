package br.com.gabriel.comportamentoDeMemoriaArraysListas.vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class maiorPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		double maiorValor = 0.0;
		int posicao = 0;
		for(int i =0; i<vetor.length;i++) {
			if(vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				posicao = i;
			}
		}
		System.out.printf("Mairo valor = %.2f%n",maiorValor);
		System.out.println("Posição =  " + posicao);
		
		sc.close();

	}

}
