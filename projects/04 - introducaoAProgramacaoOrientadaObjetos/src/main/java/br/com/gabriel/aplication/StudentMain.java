package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student aluno = new Student();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		if(aluno.notaFinal() >= 60) {
			System.out.printf("FINAL GRADE = %.2f%nPASS",aluno.notaFinal());
		}else {
			double missing = 60 - aluno.notaFinal();
			System.out.printf("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINTS",aluno.notaFinal(),missing);
		
		}
		
		sc.close();

	}

}
