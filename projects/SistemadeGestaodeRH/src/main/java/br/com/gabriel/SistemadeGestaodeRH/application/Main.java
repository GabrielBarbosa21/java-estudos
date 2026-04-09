package br.com.gabriel.SistemadeGestaodeRH.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos usuarios deseja cadastrar: ");
		int qtd = sc.nextInt();
		System.out.println();
		List<employee> employee = new ArrayList<>();

		for (int i = 0; i < qtd; i++) {
			System.out.println();
			System.out.println("Funcionario:" + (i + 1) + "a:");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			while (hasId(employee, id)) {
				System.out.print("Id já existe! Digite novamente: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Data de contratação: ");
			String hireDateStr = sc.next();
			System.out.print("Salario inicial: ");
			Double salary = sc.nextDouble();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			LocalDate hireDate = LocalDate.parse(hireDateStr, formatter);

			employee emp = new employee(id, name, salary, hireDate);
			employee.add(emp);
		}
		
		System.out.println();
		System.out.println("Aumento de salario!");
		System.out.print("ID do funcionario: ");
		Integer idFun = sc.nextInt();
		employee emp = employee.stream().filter(x -> x.getId().equals(idFun)).findFirst().orElse(null);

		if (emp == null) {
			System.out.println();
			System.out.print("Id não encontrado!");
		}

		else {
			System.out.println();
			System.out.print("Porcentagem de aumento? ");
			Double porcentage = sc.nextDouble();
			emp.increaseSalary(porcentage);
		}
		System.out.println();
		for (employee update : employee) {
			System.out.println(update);
		}
		long dias = -1L;
		int id = 0;
		String nome = "";

		for (employee old : employee) {
			if (old.getTenureDays() > dias) {
				dias = old.getTenureDays();
				id = old.getId();
				nome = old.getName();
			}
		}
		System.out.println();
		System.out.println("Funcionário mais antigo: " + id + ", " + nome + ", " + dias + " dias");

		sc.close();

	}

	public static boolean hasId(List<employee> employee, int id) {
		employee emp = employee.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
		return emp != null;
	}

}
