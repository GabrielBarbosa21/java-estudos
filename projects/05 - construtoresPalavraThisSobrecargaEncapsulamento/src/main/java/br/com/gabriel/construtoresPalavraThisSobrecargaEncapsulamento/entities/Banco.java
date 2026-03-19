package br.com.gabriel.construtoresPalavraThisSobrecargaEncapsulamento;

public class Banco {

	private int number;
	private String name;
	private double deposit;
	private double accountBalance;
	private double rate = 5.0;

	public Banco(double deposit) {
		this.deposit = deposit;

	}

	public Banco(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setNameConta(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public void accountDeposit(double deposit) {
		accountBalance += deposit;
	}

	public void accountSake(double sake) {
		accountBalance -= sake;
		accountBalance -= rate;
	}

	@Override
	public String toString() {
		return "Account " + getNumber() + ", Holder " + getName() + String.format(", Balance $ %.2f", getAccountBalance());
	}

}
