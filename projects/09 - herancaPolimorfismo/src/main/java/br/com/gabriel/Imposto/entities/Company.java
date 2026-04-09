package br.com.gabriel.Imposto.entities;

public class Company extends TaxPayer{

	
	private Integer numberOrEmployees;
	
	
	public Company() {
		
	}
	
	public Company(String name, Double anualIncome, Integer numberOrEmployees) {
		super(name, anualIncome);
		this.numberOrEmployees = numberOrEmployees;
	}

	public Integer getNumberOrEmployees() {
		return numberOrEmployees;
	}

	public void setNumberOrEmployees(Integer numberOrEmployees) {
		this.numberOrEmployees = numberOrEmployees;
	}

	@Override
	public double tax() {
		double imposto = (numberOrEmployees < 10)?anualIncome*0.16 : anualIncome*0.14;
	
		return imposto;
	}

}
