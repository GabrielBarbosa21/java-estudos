package br.com.gabriel.comportamentoDeMemoriaArraysListas.employees.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class employeeMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<employee> employee = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			while (hasId(employee, id)) {
				System.out.print("Id already taken! try again: ");
				id = sc.nextInt();
			}
			System.out.print("NAME: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("SALARY: ");
			Double salary = sc.nextDouble();
			employee emp = new employee(id, name, salary);
			employee.add(emp);

		}
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer id = sc.nextInt();
		employee res = employee.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null); // expressão
																										// lambidas
		if (res == null) {
			System.out.println("This id does not exist!");
		}

		else {

			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			res.increaseSalary(percentage);

		}

		System.out.println();
		System.out.println("List employee: ");
		for (employee e : employee) {
			System.out.println(e);
		}

		sc.close();

	}

	public static boolean hasId(List<employee> list, int id) {
		employee emp = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
		return emp != null;

	}

	public static Integer posiction(List<employee> list, int id) { // outro metodo manual de buscar id
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;
	}

	
}
