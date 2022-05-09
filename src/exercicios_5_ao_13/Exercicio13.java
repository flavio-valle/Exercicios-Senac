package exercicios_5_ao_13;
import java.util.*;
public class Exercicio13 {

	public static void main(String[] args) {
		int n1, n2, n3, media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextInt();
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextInt();
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextInt();
		
		media = ((n1*2) + (n2*3) + (n3*5)) / 10;
		
		System.out.println("A sua média em ponderada é: " + media);
		
		
	}

}
