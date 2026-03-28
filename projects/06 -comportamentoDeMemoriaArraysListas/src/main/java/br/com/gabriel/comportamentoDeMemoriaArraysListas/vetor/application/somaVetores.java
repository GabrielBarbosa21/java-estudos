package br.com.gabriel.comportamentoDeMemoriaArraysListas.vetor.application;
import java.util.Scanner;

public class somaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores vai ter em cada vetor: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i<b.length;i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("Vetor resultados: ");
		for(int i = 0; i<n;i++) {
			int soma = a[i]+b[i];
			System.out.println(soma);
		}
		
		
		
		sc.close();

	}

}
