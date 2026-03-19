package br.com.gabriel.construtoresPalavraThisSobrecargaEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class BancoMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account Number: ");
		int number = sc.nextInt();
		System.out.print("Enter account Holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		Banco banco = new Banco(number, name);
		System.out.print("Is there na initial deposit? (y/n)");
		char depositAccount = sc.next().charAt(0);
		double deposit;
		if (depositAccount == 'y' || depositAccount == 'Y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			banco.accountDeposit(deposit);
		}
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(banco);
		System.out.println();
		System.out.print("Enter deposit value: ");
		deposit = sc.nextDouble();
		banco.accountDeposit(deposit);
		System.out.println("update Data: ");
		System.out.println(banco);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double sake = sc.nextDouble();
		banco.accountSake(sake);
		System.out.println("update Data: ");
		System.out.println(banco);
		

		sc.close();
	}

}
