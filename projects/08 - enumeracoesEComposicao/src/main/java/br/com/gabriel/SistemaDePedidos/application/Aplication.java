package br.com.gabriel.SistemaDePedidos.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Aplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		DateTimeFormatter fmrt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birth = LocalDate.parse(sc.next(), fmrt);
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
		LocalDateTime moment = LocalDateTime.now();
		Order orde = new Order(moment, orderStatus, new Client(name, email, birth));
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + "item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			Double priceProduct = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();

			OrderItem ordeitem = new OrderItem(quantity, priceProduct, new Product(nameProduct, priceProduct));
			orde.addOrderItem(ordeitem);

		}
		System.out.println();
		System.out.println(orde);

		sc.close();

	}

}
