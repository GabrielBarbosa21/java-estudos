package br.com.gabriel.GeradorDeEtiquetas.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    
	static DateTimeFormatter fmrt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public final String priceTag() {
		return name 
				+" (used) $"+String.format("%.2f", price)
				+"(Manusfacture date): "+ manufactureDate.format(fmrt);
	}
	
}
