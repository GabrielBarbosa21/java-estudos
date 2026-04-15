package br.com.gabriel.interfaces.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		try {
		Locale.setDefault(Locale.US);
		DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre os dados do Contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(),frmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		Contract contract = new Contract(number, date, totalValue);
		System.out.print("Entre com o numero de parcelas: ");
		int installments = sc.nextInt();
		ContractService service = new ContractService(new PaypalService());
			
			service.processContract(contract, installments);
		System.out.println();
		System.out.println(contract);
		sc.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Erro: ");
			e.printStackTrace();
			
		}

		

	}

}
