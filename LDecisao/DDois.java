package LDecisao;
import java.util.Scanner;
public class DDois 
{
	
	public static void main(String[] args)
	{
			Scanner ler = new Scanner(System.in);
	         
	         int n1,n2,n3;
	         System.out.println("Digite o primeiro n�mero:  ");
	         n1=ler.nextInt();
	         
	         System.out.println("Digite o segundo n�mero:  ");
	         n2=ler.nextInt();
	         
	         
	         System.out.println("Digite o terceiro n�mero:  ");
	         n3=ler.nextInt();
	         
	     if(n1 < n2)
	     { 
	            if(n2<n3) 
	               { 
	            	   System.out.println(n1+"-"+n2+"-"+n3); 
	               }
	         
	            else if(n1 < n3)
	               { 
	                  System.out.println(n1+"-"+n3+"-"+n2);
	               } 
	            else 
	              {
	            	   System.out.println(n3+"-"+n1+"-"+n2);	 
	               }
		  }
	     
	      else if(n2<n3)
	      {
	             if(n1<n3)
	        	 {
	        		   System.out.println(n2+"-"+n1+"-"+n3);
	        	 }
	              else  
	        	 {
	        		   System.out.println(n2+"-"+n3+"-"+n1);
	        	 }
	      }
	      else 
	             {
	        	       System.out.println(n3+"-"+n2+"-"+n1);
	        	 }
	 }
}
