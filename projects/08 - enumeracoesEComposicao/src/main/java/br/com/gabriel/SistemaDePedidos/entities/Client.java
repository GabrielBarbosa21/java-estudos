ppackage br.com.gabriel.SistemaDePedidos.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	private static DateTimeFormatter fmrt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private String name;
	private String email;
	private LocalDate btnDate;
	
	
	
	public Client() {
		
	}

	public Client(String name, String email, LocalDate btnDate) {
		this.name = name;
		this.email = email;
		this.btnDate = btnDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBtnDate() {
		return btnDate;
	}

	public void setBtnDate(LocalDate btnDate) {
		this.btnDate = btnDate;
	}

	@Override
	public String toString() {
		return name+ " " 
				+btnDate.format(fmrt)+ "- "
				+email;
	}
	
	
	
}
