package LVetorMatriz;

import java.util.Scanner;

public class VeMaDois
{
	public static void main(String[] args) 
	{
		 Scanner  fofolete = new Scanner(System.in); 
		      int soma=0, PontMaior, cont=0,md;
		      int dado []= new int [10];
		      
				for(int x=0;x<10;x++)
				{
					System.out.println("\nDigite o valor correspondendo do dado: ");
				dado[x] = fofolete.nextInt();

					soma=soma+dado[x];

					
					if(dado[x]>=6)
					{
						cont=cont+1;
					}
				}
				
				md=soma/10;
				System.out.println ("\n\nO valor da média aritmética é de: "+ md + "\n");
				System.out.println("\nOcorrências de maior pontuação: "+ cont+ "\n");
				
				
	}	
}
