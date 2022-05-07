package apostilaManzano;

public class L03J {

	public static void main(String[] args) {
		 int soma = 0, media = 0, cont = 50, par = 0;

         while (cont < 70)
         {
             if (cont % 2 == 0)
             {
                 soma = cont + soma;
                 par = cont;
                 cont++;
             }
             else
             {
                 cont++;
             }
         }
         media = soma / par;
         
         System.out.println("A soma dos números pares é: " + soma + " e a media é: " + media);
	}

}
