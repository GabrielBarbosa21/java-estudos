package br.com.gabriel.interfaces.model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public OnlinePaymentService getOnlinePaymentService() {
		return onlinePaymentService;
	}

	public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double installment = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			
			
			 double updatedQuota = installment + onlinePaymentService.interest(installment, i);
			    double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			LocalDate date = contract.getDate().plusMonths(i);

			contract.addInstallment(new Installment(date, fullQuota));

		}

	}

}
