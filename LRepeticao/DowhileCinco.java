package LRepeticao;

import java.util.Scanner;

public class DowhileCinco {
/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
	public static void main(String[] args) {
		int soma=0,num;
		Scanner ler = new Scanner(System.in);
		System.out.println("\nEscolha um n�mero"); 
	       num= ler.nextInt();
	       do 
	    {
	    	   System.out.println("\nEscolha um n�mero"); 
	    	   num= ler.nextInt();
	           soma=num+soma;}
	       while(num != 0);
		    
	       System.out.println("O total da sua soma �: "+soma);
	   	System.out.println("Fim da soma.");
}
}
