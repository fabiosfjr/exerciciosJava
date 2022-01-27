package exerciciosJavaGeneration;

import java.util.Scanner;

/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */
public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, idadeEmMeses, idadeEmAnos, idadeEmDias;
		
		System.out.println("Digite sua idade expressa em dias: ");
		dias = leia.nextInt();
		
		idadeEmAnos = dias / 365;
		idadeEmMeses = (dias % 365) / 30;
		idadeEmDias = (dias % 365) % 30;
		
		System.out.println("Idade em anos: " + idadeEmAnos + " anos");
		System.out.println("Idade em meses: " + idadeEmMeses + " meses");
		System.out.println("Idade em dias: " + idadeEmDias + " dias");
		
		leia.close();
	}

}
