package exercicios_5_ao_13;
import java.util.*;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double salario, percentual, reajuste, conta;
		
		System.out.println("Digite o salário do funcionário");
		salario = entrada.nextDouble();
		System.out.println("Digite o percentual (%) de reajuste do salário: ");
		percentual = entrada.nextDouble();
		
		conta = salario * (percentual/100);
		reajuste = salario + conta;
		
		System.out.println("o salário informado é de: "+salario);
		System.out.println("O percentual ajustado foi de : "+percentual +"%");
		System.out.println("O salário reajustado terá o valor de: R$"+reajuste);
	}

}
