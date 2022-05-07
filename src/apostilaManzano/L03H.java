package apostilaManzano;
import java.util.*;
public class L03H {

	public static void main(String[] args) {
		int c;
		float f;
		
		for(c=10;c<=100;c += 10) {
			f = (9*c + 160)/5;
			System.out.println("A temperatura é de: " + c + " Graus Celsius");
			System.out.println("A temperatura convertida em Fahrenheit é de: " + f);
		}
	}

}
