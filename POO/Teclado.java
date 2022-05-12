package POO;

import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		
		ModeloTeclado teclado1 = new ModeloTeclado();
		ModeloTeclado teclado2 = new ModeloTeclado();
		Scanner fofolete = new Scanner (System.in);
		
		System.out.println("Teclado 1 : ");
		teclado1.cor="preto";
		teclado1.teclas=88;
		
		teclado1.ligar();
		teclado1.digitar();
		teclado1.ligar();
		
		teclado1.estadoAtual();
		
		System.out.println("Teclado 2");
		teclado2.cor="amarelo";
		teclado2.teclas=88;
		teclado2.digitar();
		
		teclado2.estadoAtual();
	}
}
