package apostilaManzano;
import java.util.*;
public class L03F {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,potencia;
		try {
		System.out.println("Digite a base da potência: ");
		n1 = entrada.nextInt();
		System.out.println("\nDigite a exponenciação da sua potencia: ");
		n2 = entrada.nextInt();
		potencia = (int) Math.pow(n1, n2);
		System.out.println("o número " + n1 + " elevado a " + n2 + " é igual a: " + potencia);
		} catch (Exception e) {
			System.out.println("Digite um valor válido!");
		}
		
		
	}

}
