package exercicios_5_ao_13;
import java.util.*;
public class Exercicio7 {

	public static void main(String[] args) {

		int dias, meses, idade;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		dias = idade * 365;
		meses = idade * 12;
		
		System.out.println("sua idade é de: " +idade);
		System.out.println("sua idade em meses é de: " + meses);
		System.out.println("sua idade em dias é de: " + dias);
		
	}

}
