package LDecisao;
import java.util.Scanner;
public class DTres
{
	
	
	public static void main(String[] args) 
	{
		
		
        Scanner fofolete = new Scanner (System.in);
        System.out.println("Fale sua idade: ");
        int idade;
        idade= fofolete.nextInt();
      
       		 
        
        if(idade>10 && idade<=14)
       	 System.out.println("\nVoc� est� na Categoria Infantil...");
        else if(idade>14 && idade<=17)
       	 System.out.println("\nVoc� est� na Categoria Juvenil....");
        else if(idade>17 && idade<=25)
       	 System.out.println("\nVoc� est� na Categoria Adulto.....");
        else
       	 System.out.println("\nVoc� est� em outra Categoria lamento");
       	 
	}
}