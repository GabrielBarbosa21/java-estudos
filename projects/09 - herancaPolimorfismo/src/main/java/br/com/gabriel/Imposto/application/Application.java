package appbr.com.gabriel.Imposto.plication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> tax = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			if(ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double expenditures = sc.nextDouble();
				tax.add(new Individual(name, income, expenditures));
			}else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				tax.add(new Company(name, income, employees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer taxPayer: tax) {
			System.out.println(taxPayer);
		}
		
		
		sc.close();

	}

}
