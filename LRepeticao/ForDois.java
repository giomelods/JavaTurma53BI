package LRepeticao;

import java.util.Scanner;

public class ForDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	 
	    int  num,contpar=0, contimpar=0,cont;
	      for( int x=1;x<=10;x++)
	      {   System.out.println("\nEscolha 10 n�meros"); 
	       num= ler.nextInt();
	        if(num%2==0)
	         contpar++;
	        else
	         contimpar++;
	      }
	System.out.println(contpar);
	System.out.println(contimpar);}
	      
}