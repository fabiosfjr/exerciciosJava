package exerciciosJavaGeneration;

import java.util.Scanner;

/*4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o:

D = (R + S) / 2
R = (A + 3) ** 2
S = (B + C) ** 2
 */
public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Digite um n�mero para letra A: ");
		a = leia.nextDouble();
		System.out.println("Digite um n�mero para letra B: ");
		b = leia.nextDouble();
		System.out.println("Digite um n�mero para letra C: ");
		c = leia.nextDouble();
		
		r = (a + 3) * (a + 3);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		
		System.out.println("O valor de R � " + r);
		System.out.println("O valor de S � " + s);
		System.out.println("Sendo assim, D = (R + S) / 2 =  " + d);
			
		leia.close();
		
	}

}
