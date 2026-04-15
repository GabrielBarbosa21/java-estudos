package br.com.gabriel.interfaces.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	
	
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();

	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallment() {
		return installments;
	}
	public void addInstallment(Installment installment) {
		installments.add(installment);
	}
	public void removeInstallments(Installment installment) {
		installments.remove(installment);
	}

	DateTimeFormatter fmrt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Parcelas:"+"\n");
		for(Installment ins: installments) {
			sb.append(ins.getDueDate().format(fmrt) + "-" + String.format("%.2f", ins.getAmount()) + "\n");
		}
		return sb.toString();
	}
	

}
