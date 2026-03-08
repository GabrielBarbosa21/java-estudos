package br.com.gabriel.repetitivas;
import java.util.Locale;
import java.util.Scanner;
public class repetitivasFor03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();

		
		for(int i = 0; i < N; i++ ) {
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			
			double media = (x * 2 + y * 3 + z * 5) / 10;
			
			System.out.printf("%.1f%n",media);
		}
		
		
		
		
		sc.close();
	}

}
