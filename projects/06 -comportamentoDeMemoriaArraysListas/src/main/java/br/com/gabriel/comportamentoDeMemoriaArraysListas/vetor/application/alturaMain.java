package br.com.gabriel.comportamentoDeMemoriaArraysListas.vetor.application;

import java.util.Locale;
import java.util.Scanner;

import entities.altura;

public class alturaMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		altura[] alt = new altura[n];
		
		for(int i = 0; i<alt.length;i++) {
			System.out.printf("dados da %da pessoa%n",i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			alt[i] = new altura(nome,idade,altura);
		}
		double media=0;
		double menorIdade=0;
		
		for(int i = 0; i<alt.length;i++) {
			media += alt[i].getAltura();
			if(alt[i].getIdade()<16) {
				menorIdade += 1;
			}
		}
		
		media /=n;
		menorIdade = menorIdade*100/n;
		System.out.printf("Altura media:  %.2f%n",media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n",menorIdade);
		
		for(int i = 0; i<alt.length;i++) {
			if(alt[i].getIdade()<16) {
				System.out.println(alt[i].getNome());
			}
		}
		
			
		
		sc.close();

	}

}
