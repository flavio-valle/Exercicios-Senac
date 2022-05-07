package apostilaManzano;
import java.util.*;
public class L03C {

	public static void main(String[] args) {
		int n1, i;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		n1 = entrada.nextInt();
		
		for(i=1;i<=10;i++)
        {
        	if(i%2==0) 
        		System.out.println(n1 + " + " + i);
            n1=n1+i;
        }
		System.out.println("o total da soma é de: " + n1);
		
		
		
	}

}
