package br.com.gabriel.sistemaDeCadastroEAnaliseDeAlunos.application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha o turno: \n" + "M - Matutino \n" + "N - Noturno");

		char continuar;

		do {

			char turno;
			List<Student> student = new ArrayList<>();

			System.out.print("Digite o turno: ");
			turno = sc.next().charAt(0);
			while (turno != 'm' && turno != 'M' && turno != 'n' && turno != 'N') {
				System.out.println("Turno Invalido");
				System.out.print("Digite Novamente: ");
				turno = sc.next().charAt(0);
			}
			System.out
					.println((turno == 'M' || turno == 'm') ? "Turno escolhido: Matutino" : "Turno escolido: Noturno");
			System.out.println();
			System.out.print("Quantos Alunos serão cadastrados? ");
			int qtdAlunos = sc.nextInt();
			while(qtdAlunos <= 0) {
				System.out.print("Erro, numero invalido! digite novamente: ");
				qtdAlunos = sc.nextInt();
			}
			System.out.println();

			for (int i = 1; i <= qtdAlunos; i++) {

				System.out.println("Aluno " + i);
				System.out.print("Nome: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Idade: ");
				int age = sc.nextInt();
				System.out.print("Nota 1: ");
				double notice1 = sc.nextDouble();
				while (notice1 > 10.0 || notice1 < 0.0) {
					System.out.print("Digite um numero entre 0 e 10: ");
					notice1 = sc.nextDouble();
				}
				System.out.print("Nota 2: ");
				double notice2 = sc.nextDouble();
				while (notice2 > 10.0 || notice2 < 0.0) {
					System.out.print("Digite um numero entre 0 e 10: ");
					notice2 = sc.nextDouble();
				}

				student.add(new Student(name, age, notice1, notice2));
				System.out.println();

			}

			int aprovados = 0;
			int recuperacao = 0;
			int reprovados = 0;
			int maiorIdade = 0;
			double somaMedias = 0.0;
			double mediaGeral = 0.0;
			for (int i = 0; i < student.size(); i++) {

				if (student.get(i).average() >= 7.0) {
					aprovados++;
				} else if (student.get(i).average() >= 5.0 && student.get(i).average() < 7.0) {
					recuperacao++;
				} else if (student.get(i).average() < 5.0) {
					reprovados++;
				}
				if (student.get(i).getAge() >= 18) {
					maiorIdade++;
				}
				somaMedias += student.get(i).average();

			}

			System.out.println("Resumo final: ");
			System.out.println("Aprovados: " + aprovados);
			System.out.println("Recuperação: " + recuperacao);
			System.out.println("Reprovados: " + reprovados);
			System.out.println("Maior de idade: " + maiorIdade);
			System.out.println("Soma das medias: " + somaMedias);
			mediaGeral = somaMedias / qtdAlunos;
			System.out.println("Media geral da turma: " + String.format("%.2f", mediaGeral));
			double porcentagemAprovados = (double) aprovados * 100 / qtdAlunos;
			System.out.println("Porcentage de Aprovados: " + String.format("%.2f", porcentagemAprovados));
			System.out.println();
			System.out.println(student);

			System.out.print("Deseja executar novamente? (s/n): ");
			continuar = sc.next().charAt(0);
			System.out.println();

			System.out.println();
			boolean sucess = new File("C:" + "\\RelatorioAlunosJava").mkdirs();
			System.out.println("Arquivo com Relatorio Criado? " + sucess);
			String path = "C:\\RelatorioAlunosJava\\alunos.txt";
			System.out.println();
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
				System.out.println("Adicionando Relatorio no Caminha C:\\RelatorioAlunosJava\\alunos.txt");
				String turnoExtenso = (turno == 'M' || turno == 'm') ? "Matutino" : "Noturno";
				for (Student stud : student) {
					bw.write(stud.getName() + ", Media: " + String.format("%.2f", stud.average()) + " ,Status: "
							+ stud.Situation() + " ,Turno: " + turnoExtenso);
					bw.newLine();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		} while (continuar == 's' || continuar == 'S');

		sc.close();

	}

}
