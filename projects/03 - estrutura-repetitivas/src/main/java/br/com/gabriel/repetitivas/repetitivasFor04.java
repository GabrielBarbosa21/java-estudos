package br.com.gabriel.repetitivas;
import java.util.Locale;
import java.util.Scanner;
public class repetitivasFor04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			if( y == 0) {
				System.out.println("Divisão impossivel!");
			}else {
				double divisao = x/y;
				System.out.printf("%.1f%n",divisao);
			}
			
		}
		
		
		sc.close();
	}

}
