package exercicios_5_ao_13;
import java.util.*;
public class Exercicio8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int eleitores, totbrancos,totnulos,totvalidos;
		
		System.out.println("digite o total de eleitores no município: ");
		eleitores = entrada.nextInt();
		System.out.println("digite o total de votos brancos:  ");
		totbrancos = entrada.nextInt();
		System.out.println("digite o total de votos nulos:  ");
		totnulos = entrada.nextInt();
		System.out.println("digite o total de votos válidos:  ");
		totvalidos = entrada.nextInt();
		
		System.out.println("O total de eleitores é de: " + eleitores + " eleitores.");
		System.out.println("O percentual de votos brancos é de: " + (totbrancos / (eleitores/100))+"%");
		System.out.println("O percentual de votos núlos é de: " + (totnulos / (eleitores/100)) +"%");
		System.out.println("O percentual de votos válidos é de: "  + (totvalidos /(eleitores/100)) + "%");
	}

}
