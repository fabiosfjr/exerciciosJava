package exerciciosJavaGeneration;

import java.util.Scanner;

/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
 */

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediaFinal;
		
		System.out.println("Digite a 1� nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a 2� nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a 3� nota: ");
		nota3 = leia.nextDouble();
		
		mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("A m�dia final do aluno � " + mediaFinal);
		
		leia.close();

	}

}
