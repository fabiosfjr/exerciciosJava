package exerciciosJavaGeneration;

import java.util.Scanner;

/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
A fórmula que efetua tal cálculo é: 
 */

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		double x1, x2, y1, y2, d1, d2, distancia;
	
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		d1 = Math.pow(x2 - x1, 2);
		d2 = Math.pow(y2 - y1, 2);
		distancia = Math.sqrt(d1 + d2);
		
		System.out.println("A distância entre os pontos é: " + distancia);
		
		leia.close();
		
	}

}
