package exercicios_5_ao_13;
import java.util.*;
public class Exercicio6 {

	public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);
			int base, altura, area;
			
			System.out.println("Digite a base do seu retângulo: ");
			base = entrada.nextInt();
			System.out.println("Digite a altura do seu retângulo: ");
			altura = entrada.nextInt();
			area = base * altura;
			
			System.out.println("A área do seu retângulo é de " + area + "m²!");
		
	}

}
