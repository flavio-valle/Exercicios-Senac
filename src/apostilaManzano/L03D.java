package apostilaManzano;
import java.util.*;
public class L03D {

	public static void main(String[] args) {

		int i, n1 = 0;
		
		for (i=1; i<=20; i++) {
		if (i % 2 == 1) {
			System.out.println(n1);
			n1 = n1 + i;
			System.out.println("o número " + i + " é impar!");
			System.out.println(n1 + " + " + i);
			
		}
		else {
			System.out.println("o número " + i + " é par!");
		}

		}
		System.out.println("A soma dos números impares de 1 a 20 é de: " + (n1 + 19));
		
	}

}
