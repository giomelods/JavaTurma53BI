package LDecisao;
import java.util.Scanner;
public class DUm {


  public static void main(String[] args) {
			
	            Scanner ler= new Scanner (System.in);
	            
	            int n1,n2,n3, maior=0, x=0, meio=0, menor=0;
	            System.out.println("Digite o primeiro número:  ");
	            n1=ler.nextInt();
	            
	            System.out.println("Digite o segundo número:  ");
	            n2=ler.nextInt();
	            
	            
	            System.out.println("Digite o terceiro número:  ");
	            n3=ler.nextInt();
	            
	           
	          if (n1>n2 && n1>n3)
	          {
	        	 maior=n1;
	        	 if(n2>n3) {
	        		 meio=n2; 
	                 menor=n3;
	        	 }
	        		 if(n3>n2) {
	        			 meio=n3;
	        		 menor=n2;}
	       
	          } 
	          else if(n2>n1 && n2>n3)
	          {
	        	  maior=n2;
	        	  if(n1>n3)  {
	        	  meio=n1;
	        	  menor=n3;  }
	        	  
	        	  
	      
	           }
	          else if(n3>n1 && n3>n2)
	          {
	        	  maior=n3;
	        	  if(n2>n1) {
	              meio=n2;
	        	  menor=n3;}
	          }
	          		System.out.println("\nO maior número é:   "+ maior);  
	         
	          }
	}
