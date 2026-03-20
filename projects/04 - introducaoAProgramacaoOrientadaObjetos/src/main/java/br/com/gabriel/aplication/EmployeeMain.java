package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println();
		System.out.println(emp);
		System.out.println();
		System.out.print("Wichi percentage to increase salary? ");
		double porcentage = sc.nextDouble();
		emp.increaseSalary(porcentage);
		
		System.out.printf("Updated date: %s, $ %.2f",emp.name,emp.grossSalary);
		
		
		sc.close();

	}

}
