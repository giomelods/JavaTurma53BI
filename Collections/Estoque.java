package Collections;

import java.util.*;

public class Estoque {
	

               public static void main(String[] args) {
			
			ArrayList <String> estoques = new ArrayList<>();
			
			String estoque1 = "Batom";
			String estoque2 = "P�";
			String estoque3 = "Brush";
			String estoque4 = "Iluminador";
			
			
			estoques.add(estoque1);
			estoques.add(estoque2);
			estoques.add(estoque3);
			estoques.add(estoque4);
			
		
			
			System.out.println("Sejam bem vindes ao meu estoques de make!!!!!");
			
			System.out.println("\nApresentando todas informa��es da minha lista: " + estoques);
			
			
			System.out.println("\nTamanho da Lista: " + estoques.size());
			estoques.remove(2);
			System.out.println("\nRemovi o ind�ce 2: "+ estoques);
			System.out.println("\nTamanho da Lista agora �:  \n" + estoques.size());
			
			
			
			System.out.println("\nVerificando informa��es na lista: " + estoques);
			
			
			
			
			
			

			
				
		}


	}