package apostilaManzano;
import java.util.*;
public class L03i {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0, i = 1, media;
		int somatorio = 0;

		while (i <= 10) {
			
			System.out.println("Digite um n�mero:");
			n = entrada.nextInt();
			somatorio += n;
			i++;
		}
		media = somatorio /10;
		System.out.println("A soma de todas as notas � de:" + somatorio);
		System.out.println ("A m�dia de todas as notas � de:" + media);
		
	}

}
