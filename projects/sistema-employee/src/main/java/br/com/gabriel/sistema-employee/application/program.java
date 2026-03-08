package br.com.gabriel.sistema_employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos Funcionarios deseja registrar? ");
		int N = sc.nextInt();
		List<Employee> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			System.out.println("#" + (1 + i) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id ja cadastrado, digite novamente: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			System.out.print("Departamento: ");
			sc.nextLine();
			String department = sc.nextLine();

			list.add(new Employee(id, name, salary, department));
		}
		for (int i = 0; i != 7;) {
			if (i > 7) {
				System.out.println();
				System.out.println("Numero invalido!");
				System.out.println();
			}
			System.out.println();
			System.out.println("1 - Aumentar salário de um funcionário");
			System.out.println("2 - Mudar funcionário de departamento");
			System.out.println("3 - Remover funcionário pelo ID");
			System.out.println("4 - Listar funcionários de um departamento específico");
			System.out.println("5 - Listar todos os funcionários em ordem crescente de salário");
			System.out.println("6 - Listar todos os funcionários em ordem alfabética");
			System.out.println("7 - sair");

			i = sc.nextInt();

			if (i == 1) {
				System.out.print("Qual o Id do funcionario? ");
				int id = sc.nextInt();
				Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if (emp == null) {
					System.out.println();
					System.out.println("Id invalidado! ");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("Informações do funcionario: ");
					System.out.println(emp);
					System.out.println();
					System.out.print("Quantos porcento deseja aumentar? ");
					double porc = sc.nextDouble();
					emp.aumentarSalary(porc);
					System.out.println();
					System.out.println("Atualização: ");
					System.out.println(emp);
					System.out.println();
				}

			}
			if (i == 2) {
				System.out.println();
				System.out.print("Qual Id do Funcionario? ");
				int id = sc.nextInt();
				Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if (idExists(list, id)) {
					System.out.println();
					System.out.println("Id invalidado!");

				} else {
					System.out.println("inforções do Funcionario: ");
					System.out.println();
					System.out.println(emp);
					System.out.println();
					System.out.print("Informe um novo departamento? ");
					sc.nextLine();
					String dptm = sc.nextLine();
					emp.setDepartment(dptm);
					System.out.println();
					System.out.printf("Atualição:%n %s%n ", emp);

				}

			}
			if (i == 3) {
				System.out.print("Digite o Id do funcionario: ");
				int id = sc.nextInt();
				if (idExists(list, id)) {
					System.out.println();
					System.out.println("Id invalidado!");
					System.out.println();
				} else {
					System.out.println();
					remove(list, id);
					System.out.println("usuario removido! ");

				}
			}
			if (i == 4) {
				System.out.print("Qual departamento deseja listar? ");
				sc.nextLine();
				String listDp = sc.nextLine();
				List<Employee> filtroLista = list.stream().filter(x -> x.getDepartment().equals(listDp))
						.collect(Collectors.toList());
				if (filtroLista.isEmpty()) {
					System.out.println();
					System.out.println("Nenhum Funcionario encontrado");
				} else {
					System.out.println();
					System.out.println(filtroLista);
				}

			}
			if (i == 5) {
				List<Employee> listCrescente = list;
				listCrescente.sort(Comparator.comparing(Employee::getSalary));
				for (Employee x : listCrescente) {
					System.out.println(x);
				}
			}
			if (i == 6) {
				List<Employee> listAlfabet = list;
				listAlfabet.sort(Comparator.comparing(Employee::getName));
				for (Employee x : listAlfabet) {
					System.out.println(x);

				}
			}
		}
		sc.close();

	}

	// verificar para ver se o id não esta sendo repetido.
	static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

	// se o id não for encontratado.

	static boolean idExists(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp == null;
	}

	static boolean remove(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return list.remove(emp);
	}

}
