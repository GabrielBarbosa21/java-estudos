package br.com.gabriel.GeradorDeEtiquetas.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmrt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		List<Product> product = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + "data: ");
			System.out.print("Common used or imported (c/u/i)? ");
			char imported = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (imported == 'c') {
				product.add(new Product(name, price));
			} else if (imported == 'i') {
				System.out.print("Customs fee: ");
				double customs = sc.nextDouble();
				product.add(new ImportedProduct(name, price, customs));
			} else if (imported == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				LocalDate datefmrt = LocalDate.parse(date, fmrt);
				product.add(new UsedProduct(name, price, datefmrt));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product prod : product) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}
