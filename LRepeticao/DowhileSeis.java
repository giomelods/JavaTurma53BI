package LRepeticao;

import java.util.Scanner;

public class DowhileSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    int num;
			double media, multidetres = 0.0, soma = 0.0;
			Scanner fofolete = new Scanner(System.in);
			do {
				System.out.println("Digite um n�mero INTEIRO: ");
				 num=fofolete.nextInt();
				
				if(num % 3 == 0 && num != 0) {
					multidetres++;
					soma = soma + num;
				}
			}
			while(num != 0);
			
			media = soma / multidetres;
				
			System.out.println("A m�dia dos n�meros digitados que s�o n�meros m�ltiplos de 3 �: " + media);
	      
 
	}
	}