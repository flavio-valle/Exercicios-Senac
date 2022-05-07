package apostilaManzano;
import java.util.*;
public class L03B {

	public static void main(String[] args) {
		int num, i = 1, soma = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um número: ");
		num = entrada.nextInt();
		
		while (i <= 100) {
			soma = soma +i;
			i++;
			
			System.out.println("A soma  é igual a: " + soma);
		}
	}

}
