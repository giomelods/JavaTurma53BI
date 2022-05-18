package Collections;

import java.util.*;

public class Estoque {
	

               public static void main(String[] args) {
			
			ArrayList <String> estoques = new ArrayList<>();
			
			String estoque1 = "Batom";
			String estoque2 = "Pó";
			String estoque3 = "Brush";
			String estoque4 = "Iluminador";
			
			
			estoques.add(estoque1);
			estoques.add(estoque2);
			estoques.add(estoque3);
			estoques.add(estoque4);
			
		
			
			System.out.println("Sejam bem vindes ao meu estoques de make!!!!!");
			
			System.out.println("\nApresentando todas informações da minha lista: " + estoques);
			
			
			System.out.println("\nTamanho da Lista: " + estoques.size());
			estoques.remove(2);
			System.out.println("\nRemovi o indíce 2: "+ estoques);
			System.out.println("\nTamanho da Lista agora é:  \n" + estoques.size());
			
			
			
			System.out.println("\nVerificando informações na lista: " + estoques);
			
			
			
			
			
			

			
				
		}


	}