package br.com.gabriel.Imposto.entities;

public class Individual extends TaxPayer{

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public double tax() {
		
		double imposto = (anualIncome < 20000.00)? anualIncome*0.15 : anualIncome*0.25;
		 return imposto += healthExpenditures * 0.50;
		 
	}

	
}
