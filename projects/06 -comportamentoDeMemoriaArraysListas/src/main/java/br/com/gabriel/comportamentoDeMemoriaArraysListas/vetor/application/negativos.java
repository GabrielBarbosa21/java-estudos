package br.com.gabriel.comportamentoDeMemoriaArraysListas.vetor.application;
import java.util.Scanner;
public class negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vai digitar: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for(int i = 0;i<vetor.length;i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		System.out.println("NEGATIVOS");
		for(int i = 0; i<vetor.length;i++) {
			if(vetor[i]<0) {
				System.out.println(vetor[i]);
			}
		}
		
		
		
		
		
		sc.close();

	}

}
