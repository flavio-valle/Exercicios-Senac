package exercicios_5_ao_13;
import java.util.*;
public class Exercicio6 {

	public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);
			int base, altura, area;
			
			System.out.println("Digite a base do seu ret�ngulo: ");
			base = entrada.nextInt();
			System.out.println("Digite a altura do seu ret�ngulo: ");
			altura = entrada.nextInt();
			area = base * altura;
			
			System.out.println("A �rea do seu ret�ngulo � de " + area + "m�!");
		
	}

}
