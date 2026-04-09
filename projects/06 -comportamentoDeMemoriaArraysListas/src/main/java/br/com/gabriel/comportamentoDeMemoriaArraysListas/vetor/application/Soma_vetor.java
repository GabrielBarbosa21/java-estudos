package br.com.gabriel.comportamentoDeMemoriaArraysListas.vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros vai digitar: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		System.out.println();
		System.out.print("Valores = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(" " + vetor[i]);
		}
		System.out.println();
		System.out.print("Soma = ");
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.println(soma);

		double media = soma / n;
		System.out.println("Media = "+media);

		sc.close();

	}

}
