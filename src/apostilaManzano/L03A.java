package apostilaManzano;
import java.util.*;
public class L03A {
	public static void main(String[]args) {
		
		int tabuada, numero, i = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um número que irá multiplicar: ");
		numero = entrada.nextInt();
		
		while (i <= 10) {
			tabuada = numero * i;
			System.out.println(numero + " x " + i + " = " + tabuada);
			i++;
		}
		
	}
	
	
}
