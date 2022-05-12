package Heranca;

public class Cachorro extends Animal {

	public boolean correr;
	
	public void movimentar ()
	{
		if(this.correr==true)
			System.out.println("O cachorro está correndo ");
		else
			System.out.println("Ué! O cachorro não está correndo");
	}
}
