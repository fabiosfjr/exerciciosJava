package exerciciosJavaGeneration;

import java.util.Scanner;

/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, eventoEmHoras, eventoEmMinutos, eventoEmSegundos;
		
		System.out.println("Digite a dura��o do evento em segundos: ");
		segundos = leia.nextInt();
		
		eventoEmHoras = segundos / 3600;
		eventoEmMinutos = (segundos % 3600) / 60;
		eventoEmSegundos = (segundos % 3600) % 60;
		
		System.out.println("A dura��o do evento foi de: " + eventoEmHoras + " horas, " + eventoEmMinutos + " minutos e " + eventoEmSegundos + " segundos." );
		
		leia.close();
	}

}
