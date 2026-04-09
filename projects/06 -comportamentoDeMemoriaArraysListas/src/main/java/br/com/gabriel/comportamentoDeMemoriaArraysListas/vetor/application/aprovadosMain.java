package br.com.gabriel.comportamentoDeMemoriaArraysListas.vetor.application;

import java.util.Locale;
import java.util.Scanner;

import entities.aprovados;

public class aprovadosMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		aprovados[] aprovados = new aprovados[n];
		for(int i = 0;i<aprovados.length;i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do alunos: %n",i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			aprovados[i] = new aprovados(nome,nota1,nota2);
		}
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i<aprovados.length;i++) {
			double media = (aprovados[i].getNota1() + aprovados[i].getNota2())/2;
			if(media >= 6.0) {
				System.out.println(aprovados[i].getNome());
				
			}
		}
		
		
		
		
		sc.close();

	}

}
