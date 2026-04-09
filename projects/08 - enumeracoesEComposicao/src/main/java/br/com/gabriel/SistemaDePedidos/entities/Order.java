ppackage br.com.gabriel.SistemaDePedidos.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static DateTimeFormatter fmrt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orderItem = new ArrayList<>();
	
	
	public Order() {
		
	}
	public Order(LocalDateTime moment, OrderStatus status, Client clien) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = clien;
	}
	public LocalDateTime getMoment() {
		return moment;
	}
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClien() {
		return client;
	}
	public void setClien(Client clien) {
		this.client = clien;
	}
	
	public void addOrderItem(OrderItem order) {
		orderItem.add(order);
	}
	public void removeOrderItem(OrderItem order) {
		orderItem.remove(order);
	}
	
	public double total() {
		double priceTotal = 0.0;
		for(OrderItem orde : orderItem ) {
			priceTotal += orde.subTotal();
		}
		return priceTotal;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: ");
		sb.append(moment.format(fmrt2)+ "\n");
		sb.append("Order status: ");
		sb.append(status+ "\n");
		sb.append("Client: ");
		sb.append(client+"\n");
		sb.append("Order items: \n");
		for(OrderItem orde : orderItem) {

			sb.append(orde+ "\n");
		}
		sb.append(String.format("Total price: $%.2f", total()));
		return sb.toString();
		
	}
	
	
}
