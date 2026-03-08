package br.com.gabriel.repetitivas;

import java.util.Scanner;

public class repetitivasFor01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {

		

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
		if (x % 2 > 0) {
			System.out.println(x);
		}

		sc.close();
	}

}
