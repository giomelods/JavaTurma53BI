package LRepeticao;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class WhileTres {
	public static void main(String[] args) {
		int idade, contmais=0,contmenos=0, total=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("\nMe fale sua idade");
		 idade=ler.nextInt();
		 
		 while(idade<99)
		 {
			 System.out.println("\nMe fale sua idade");
			 idade=ler.nextInt();
			 if (idade<21 )
			  contmenos++;
			 
			  else if(idade>50)
		      contmais++;
		 }
		 System.out.println("O Total de pessoas com menos de 21 anos são: "+contmenos);
           
	     System.out.println("O Total de pessoas com mais de 50 anos são: "+contmais);
	         
		 
	
	}
}