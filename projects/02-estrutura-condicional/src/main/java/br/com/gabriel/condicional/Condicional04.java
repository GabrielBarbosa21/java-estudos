package br.com.gabriel.condicional;

import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInial =sc.nextInt();
		int horaFinal = sc.nextInt();
		int resul;
		if(horaInial < horaFinal) {
			resul = horaFinal-horaInial;
		}else {
			resul = 24-horaInial + horaFinal;
		}
		System.out.println("O JOGO DUROU " +resul+ " HORAS");
		
		
		
		
		sc.close();

	}

}
