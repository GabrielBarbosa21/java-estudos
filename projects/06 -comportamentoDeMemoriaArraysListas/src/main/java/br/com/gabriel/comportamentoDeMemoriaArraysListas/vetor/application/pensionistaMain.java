package  br.com.gabriel.comportamentoDeMemoriaArraysListas.vetor.application;

import java.util.Locale;
import java.util.Scanner;

import entities.pensionista;

public class pensionistaMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented: ");
		int n = sc.nextInt();
		pensionista[] pen = new pensionista[10];
		for(int i = 0; i<n;i++) {
			System.out.printf("Rent #%d %n",i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			pen[room] = new pensionista(nome,email,room);
		}
		System.out.println("Busy rooms:");
		for(int i = 0; i<pen.length;i++) {
			if(pen[i]!= null) {
				
				System.out.println(pen[i].getRoom() +": "+pen[i].getNome() + ", "+ pen[i].getEmail());
			}
		}
		
		
		sc.close();

	}

}
