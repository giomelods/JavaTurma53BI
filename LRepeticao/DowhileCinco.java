package LRepeticao;

import java.util.Scanner;

public class DowhileCinco {
/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
	public static void main(String[] args) {
		int soma=0,num;
		Scanner ler = new Scanner(System.in);
		System.out.println("\nEscolha um número"); 
	       num= ler.nextInt();
	       do 
	    {
	    	   System.out.println("\nEscolha um número"); 
	    	   num= ler.nextInt();
	           soma=num+soma;}
	       while(num != 0);
		    
	       System.out.println("O total da sua soma é: "+soma);
	   	System.out.println("Fim da soma.");
}
}
