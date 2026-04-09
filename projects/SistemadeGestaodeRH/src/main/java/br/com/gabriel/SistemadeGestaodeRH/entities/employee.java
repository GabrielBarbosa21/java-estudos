package br.com.gabriel.SistemadeGestaodeRH.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class employee {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private Integer id;
	private String name;
	private Double salary;
	private LocalDate hireDate;

	public employee(Integer id, String name, Double salary, LocalDate hireDate) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}

	public long getTenureDays() {
	    LocalDate now = LocalDate.now();
	    return ChronoUnit.DAYS.between(this.hireDate, now); 
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Nome: " + name + ", Data: " + hireDate.format(formatter)
				+ String.format(", Salario: %.2f", salary);
	}

}
