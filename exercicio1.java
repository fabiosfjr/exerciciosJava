package exerciciosJavaGeneration;

import java.util.Scanner;

/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
*/

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos, idadeEmDias;
		
		System.out.println("Digite sua idade expressa em anos: ");
		anos = leia.nextInt();
		System.out.println("Quantos meses se passaram depois do seu �ltimo anivers�rio: ");
		meses = leia.nextInt();
		System.out.println("Quando dias se passaram depois do �ltimo m�s informado acima: ");
		dias = leia.nextInt();
		
		idadeEmDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Voc� tem " + idadeEmDias + " dias de vida.");
		idadeEmDias = leia.nextInt();
		
		leia.close();

	}

}
