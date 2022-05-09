package exercicios_5_ao_13;

import java.util.*;

public class Exercicio12 {
	public static void main(String[] args) {
		 
        Double grausCentigrados;
        Double grausFahrenheit;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Centigrados");
        grausCentigrados = entrada.nextDouble();
                
 
 
        grausFahrenheit = ((grausCentigrados * 1.8)+32);
        System.out.println("A temperatura em graus Fahrenheit é" + grausFahrenheit );
 
    }
 
	
}