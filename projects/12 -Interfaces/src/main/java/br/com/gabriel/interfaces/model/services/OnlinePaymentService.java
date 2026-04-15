package br.com.gabriel.interfaces.model.services;
public interface OnlinePaymentService {
	
	double interest(Double amount, Integer months);
	double paymentFee(Double amount);
	
}
