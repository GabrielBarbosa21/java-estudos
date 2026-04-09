package br.com.gabriel.comportamentoDeMemoriaArraysListas.vetor.application;

import java.util.Locale;
import java.util.Scanner;

import entities.dadosPessoas;

public class dadosPessoasMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		dadosPessoas[] pessoa = new dadosPessoas[n];
		for(int i = 0; i<pessoa.length;i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			char genero = sc.next().charAt(0);
			pessoa[i] = new dadosPessoas(altura,genero);
		}
		double menorAltura = pessoa[0].getAltura();
		double maiorAltura = 0.0;
		double mediaMulher = 0.0;
		int numeroMulher = 0;
		int numeroHomens = 0;
		
		for(int i = 0; i<pessoa.length;i++){
			 
			if(pessoa[i].getAltura() < menorAltura ) {
				menorAltura = pessoa[i].getAltura();
			}
				
			
			if(pessoa[i].getAltura() > maiorAltura) {
				maiorAltura = pessoa[i].getAltura();
			}
			if(pessoa[i].getGenero() == 'F' || pessoa[i].getGenero() == 'f') {
				mediaMulher+= pessoa[i].getAltura();
				numeroMulher += 1;
			}
			if(pessoa[i].getGenero() == 'M' || pessoa[i].getGenero() == 'm') {
				numeroHomens += 1;
			}
			
			
		}
		mediaMulher /=numeroMulher;
		System.out.printf("Menor altura = %.2f%nMaior altura = %.2f%nMedia das alturas das mulheres = %.2f%nNumero de homens = %d",menorAltura,maiorAltura,mediaMulher,numeroHomens);
			
		
		
		sc.close();
	}

}
