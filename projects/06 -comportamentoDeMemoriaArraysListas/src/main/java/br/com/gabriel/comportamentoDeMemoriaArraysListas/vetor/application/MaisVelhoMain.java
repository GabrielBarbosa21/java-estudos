package br.com.gabriel.comportamentoDeMemoriaArraysListas.vetor.application;

import java.util.Scanner;

import entities.MaisVelho;

public class MaisVelhoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar: ");
		int n = sc.nextInt();
		MaisVelho[] maisVelho = new MaisVelho[n];
		for(int i = 0;i<maisVelho.length;i++) {
			System.out.printf("Dados da %da pessoa: %n",i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			maisVelho[i] = new MaisVelho(nome,idade);
		}
		String velho="";
		int idade = 0;
		for(int i = 0; i<maisVelho.length;i++) {
			if(maisVelho[i].getIdade() > idade) {
				idade = maisVelho[i].getIdade();
				velho = maisVelho[i].getNome();
			}
		}
		System.out.printf("pessoa mais velha: %s",velho);
	
		
		sc.close();
	}

}
