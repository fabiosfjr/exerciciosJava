package exerciciosJavaGeneration;

import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
*/

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double custoConsumidor, custoFabrica, carro;
		
		System.out.println("Qual o valor do custo de f�brica do carro: ");
		carro = leia.nextDouble();
		
		custoFabrica = (carro * 0.28) + (carro * 0.45);
		custoConsumidor = carro + custoFabrica;
		
		System.out.println("O custo do carro ao consumidor final �: " + custoConsumidor);
		
		leia.close();
	
	}

}
