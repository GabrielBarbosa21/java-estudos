package br.com.gabriel.comportamentoDeMemoriaArraysListas.matriz;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[][] mat = new int[A][B];
		
		for(int i = 0;i<mat.length;i++) {
			for(int j = 0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int C = sc.nextInt();
		for(int i = 0;i<mat.length;i++) {
			for(int j = 0;j<mat[i].length;j++) {
				if(mat[i][j] == C) {
					
					System.out.println("Position: "+ i+","+j);
					if(j - 1 >= 0) {
						System.out.println("left: "+mat[i][j -1]);
					}
					if(i -1 >= 0) {
						System.out.println("up: "+mat[i -1][j]);
					}
					if(j + 1 < mat[i].length) {
						System.out.println("Right: "+mat[i][j+1]);
					}
					if(i +1 < mat.length ) {
						System.out.println("Down: "+mat[i+1][j]);
					}
				}
				
				
			}
		}
	
		
		sc.close();
	}

}
