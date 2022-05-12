package Heranca;

public class Cavalo extends Animal {
	
	public boolean correr;
	
	public void movimentar ()
	{
		if(this.correr==true)
			System.out.println("O cavalo está correndo ");
		else
			System.out.println("Ué! O cavalo não está correndo");
	}
}
