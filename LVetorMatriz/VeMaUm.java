package LVetorMatriz;

import java.util.Scanner;

public class VeMaUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		   int  pontuacao=0;
		   int n[]= new int [5];
			for(int x=0; x<5;x++)
			  {
				System.out.println("Digite sua pontuação :  ");
		        n[x] = ler.nextInt();
		            	if(n[x]>pontuacao)
		            	{
		           	 	pontuacao=n[x];
		           	
		                }
		            
		        }
			 System.out.println("\nA pontuação maior é : "+pontuacao);
			}
}
