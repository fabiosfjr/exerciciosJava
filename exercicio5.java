package exerciciosJavaGeneration;

import java.util.Scanner;

/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
 */

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediaFinal;
		
		System.out.println("Digite a 1ª nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a 2ª nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a 3ª nota: ");
		nota3 = leia.nextDouble();
		
		mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("A média final do aluno é " + mediaFinal);
		
		leia.close();

	}

}
