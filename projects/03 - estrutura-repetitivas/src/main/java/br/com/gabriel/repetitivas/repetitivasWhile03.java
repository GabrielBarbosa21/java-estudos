package br.com.gabriel.repetitivas;
import java.util.Scanner;
public class repetitivasWhile03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int qtd = sc.nextInt();
		
		while(qtd != 4) {
			if(qtd == 1) {
				alcool += 1;
			}else if(qtd == 2) {
				gasolina +=1;
			}else if(qtd == 3) {
				diesel +=1;
			}
			qtd = sc.nextInt();
		}
		System.out.printf("Muito Obrigado! %nAlcool: %d%nGasolina: %d%nDiesel: %d ",alcool,gasolina,diesel);
		
		
		sc.close();

	}

}
