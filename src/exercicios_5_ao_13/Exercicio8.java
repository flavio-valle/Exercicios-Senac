package exercicios_5_ao_13;
import java.util.*;
public class Exercicio8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int eleitores, totbrancos,totnulos,totvalidos;
		
		System.out.println("digite o total de eleitores no munic�pio: ");
		eleitores = entrada.nextInt();
		System.out.println("digite o total de votos brancos:  ");
		totbrancos = entrada.nextInt();
		System.out.println("digite o total de votos nulos:  ");
		totnulos = entrada.nextInt();
		System.out.println("digite o total de votos v�lidos:  ");
		totvalidos = entrada.nextInt();
		
		System.out.println("O total de eleitores � de: " + eleitores + " eleitores.");
		System.out.println("O percentual de votos brancos � de: " + (totbrancos / (eleitores/100))+"%");
		System.out.println("O percentual de votos n�los � de: " + (totnulos / (eleitores/100)) +"%");
		System.out.println("O percentual de votos v�lidos � de: "  + (totvalidos /(eleitores/100)) + "%");
	}

}
