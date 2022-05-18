package Heranca;

import java.util.Scanner;

public class Bichinhos {

	public static void main(String[] args) {
	
        Cachorro dog = new Cachorro();
        Cavalo horse = new Cavalo();
        Preguica sloth = new Preguica();
        Scanner fofolete = new Scanner (System.in);
        
        System.out.println("Cachorro : ");
        dog.nome="Neguinho";
        dog.idade=12;
        dog.som=true;
        dog.emitir();
        dog.correr=true;
        dog.movimentar();
        dog.estadoAtual();
        
        System.out.println();

        System.out.println("Cavalo : ");
        horse.nome="Bart";
        horse.idade=12;
        horse.som=true;
        horse.emitir();
        horse.correr=true;
        horse.movimentar();
        
        horse.estadoAtual();
        
        System.out.println();
        
        System.out.println("Bichinho Preguiça : ");
        sloth.nome="Lupy";
        sloth.idade=12;  
        sloth.som=true;
        sloth.emitir();
        sloth.subir=true;
        sloth.subindo();
        sloth.estadoAtual();
	}

}
