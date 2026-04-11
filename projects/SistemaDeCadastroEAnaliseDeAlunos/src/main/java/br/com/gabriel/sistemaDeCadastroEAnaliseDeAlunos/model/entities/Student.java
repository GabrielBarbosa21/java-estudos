package br.com.gabriel.sistemaDeCadastroEAnaliseDeAlunos.model.entities;

import model.enums.EnumsStudent;

public class Student {

	private String name;
	private Integer age;
	private Double notice1;
	private Double notice2;

	
	public Student() {
		
	}
	public Student(String name, Integer age, Double notice1, Double notice2) {
		super();
		this.name = name;
		this.age = age;
		this.notice1 = notice1;
		this.notice2 = notice2;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getNotice1() {
		return notice1;
	}

	public void setNotice1(Double notice1) {
		this.notice1 = notice1;
	}

	public Double getNotice2() {
		return notice2;
	}

	public void setNotice2(Double notice2) {
		this.notice2 = notice2;
	}

	public double average() {
		return (notice1 + notice2) / 2;
	}

	public double SquareRootOfTheMedian() {
		return Math.sqrt(average());
	}

	public double meanSquared() {
		return Math.pow(average(), 2);
	}

	public double averageDistance() {
	    return Math.abs(average() - 6.0);
	}

	public EnumsStudent Situation() {
		double avg = average();
		if (avg >= 7.0) {
			return EnumsStudent.APROVADO;
		}
		if (avg >= 5.0) {
			return EnumsStudent.RECUPERACAO;
		}
		return EnumsStudent.REPROVADO;
	}

	public String ageRange() {
		if(age >= 18 ) {
			return "Maior de idade";
		}
		return "Menor de idade";

	}
	


	@Override
	public String toString() {
		StringBuilder sb =new StringBuilder();
		sb.append("Nome: "+ name +"\n");
		sb.append(String.format("Media: %.2f%n", average()));
		sb.append(String.format("Raiz da media: %.2f%n", SquareRootOfTheMedian()));
		sb.append(String.format("Media ao quadrado: %.2f%n",meanSquared() ));
		sb.append(String.format("Distancia para media: %.2f%n",averageDistance()));
		sb.append("Situação: "+Situation()+"\n");
		sb.append("Faixa etaria: "+ageRange()+"\n");
		sb.append("\n");
		return sb.toString();
	}

}
