package POO;

import java.util.Scanner;

public class Patinete {
public static void main(String[] args) {
		
		ModeloPatinete patinete1 = new ModeloPatinete();
		
		Scanner fofolete = new Scanner (System.in);
		
		System.out.println("Patinete 1 : ");
		
		patinete1.cor="Verde";
		patinete1.quantPessoas=1;
		patinete1.peso=80.0;
		patinete1.andar();
		patinete1.estadoAtual();
		
		
	}
}


