package br.com.gabriel.TrabalhandoComArquivos.entities;

public class Products {

	private String nameProduct;
	private Integer quantity;
	private Double price;
	
	public Products() {
		
	}
	public Products(String nameProduct, Integer quantity, Double price) {
		this.nameProduct = nameProduct;
		this.quantity = quantity;
		this.price = price;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double PriceTotal() {
		return price * quantity;
	}
	
	
	
}
