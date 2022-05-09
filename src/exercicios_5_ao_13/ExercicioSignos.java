package exercicios_5_ao_13;

import java.util.*;

public class ExercicioSignos {

		 public static void main(String[] args) {
		      Scanner entrada = new Scanner(System.in);

		      int dia, mes;

		      System.out.printf("Informe o dia de nascimento:\n");
		      dia = entrada.nextInt();

		      System.out.printf("\nInforme o mes de nascimento:\n");
		      mes = entrada.nextInt();

		      if (((mes == 12) && ((dia >= 22) && (dia <= 31))) ||
		          ((mes == 1)  && ((dia >= 1)  && (dia <= 20))))
		         System.out.printf("\nSeu signo é de Capricornio!.\n");
		      else if (((mes == 1) && ((dia >= 21) && (dia <= 31))) ||
		               ((mes == 2) && ((dia >= 1)  && (dia <= 19))))
		              System.out.printf("\nSeu signo é de Aquario!.\n");
		      else if (((mes == 2) && ((dia >= 20) && (dia <= 29))) ||
		               ((mes == 3) && ((dia >= 1)  && (dia <= 20))))
		              System.out.printf("\nSeu signo é de Peixes!.\n");
		      else if (((mes == 3) && ((dia >= 21) && (dia <= 31))) ||
		               ((mes == 4) && ((dia >= 1)  && (dia <= 20))))
		              System.out.printf("\nSeu signo é de Arie!s.\n");
		      else if (((mes == 4) && ((dia >= 21) && (dia <= 30))) ||
		               ((mes == 5) && ((dia >= 1)  && (dia <= 20))))
		              System.out.printf("\nSeu signo é de Touro!.\n");
		      else if (((mes == 5) && ((dia >= 21) && (dia <= 31))) ||
		               ((mes == 6) && ((dia >= 1)  && (dia <= 20))))
		              System.out.printf("\nSeu signo é de Gemeos!.\n");
		      else if (((mes == 6) && ((dia >= 21) && (dia <= 30))) ||
		               ((mes == 7) && ((dia >= 1)  && (dia <= 21))))
		              System.out.printf("\nSeu signo é de Cancer!.\n");
		      else if (((mes == 7) && ((dia >= 22) && (dia <= 31))) ||
		               ((mes == 8) && ((dia >= 1)  && (dia <= 22))))
		              System.out.printf("\nSeu signo é de Leao!.\n");
		      else if (((mes == 8) && ((dia >= 23) && (dia <= 31))) ||
		               ((mes == 9) && ((dia >= 1)  && (dia <= 22))))
		              System.out.printf("\nSeu signo é de Virgem!.\n");
		      else if (((mes == 9)  && ((dia >= 23) && (dia <= 30))) ||
		               ((mes == 10) && ((dia >= 1)  && (dia <= 22))))
		              System.out.printf("\nSeu signo é de Libra!.\n");
		      else if (((mes == 10) && ((dia >= 23) && (dia <= 31))) ||
		               ((mes == 11) && ((dia >= 1)  && (dia <= 21))))
		              System.out.printf("\nSeu signo é de Escorpiao!.\n");
		      else if (((mes == 11) && ((dia >= 22) && (dia <= 30))) ||
		               ((mes == 12) && ((dia >= 1)  && (dia <= 21))))
		              System.out.printf("\nSeu signo é de Sagitario!.\n");
		           else
		              System.out.printf("\nErro: dia ou mes de nascimento invalidos !!!\n");
		    }

	}


