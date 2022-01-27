package exerciciosJavaGeneration;

import java.util.Scanner;

/*7. Um sistema de equações lineares do tipo: 
 * a * x + b * y = c
 * d * x + e * y = f
 *pode ser resolvido segundo mostrado abaixo:
 *x = (c * e - b * f) / (a * e - b * d)
 *y = (a * f - c * d) / (a * e - b * d)
 *Escreva um sistema que lê os coeficientes a, b, c, d, e e f e calcula e mostra os valores de x e y.
 */

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite numero a: ");
		a = leia.nextDouble();
		System.out.println("Digite numero b: ");
		b = leia.nextDouble();
		System.out.println("Digite numero c: ");
		c = leia.nextDouble();
		System.out.println("Digite numero d: ");
		d = leia.nextDouble();
		System.out.println("Digite numero e: ");
		e = leia.nextDouble();
		System.out.println("Digite numero f: ");
		f = leia.nextDouble();
		
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		
		System.out.println("Valor de x é " + x);
		System.out.println("Valor de y é " + y);

		leia.close();
		
	}

}
