package Heranca;

public class Cavalo extends Animal {
	
	public boolean correr;
	@Override
	public void emitir()
	{
		System.out.println("Relinchar");
	}
	
	
	public void movimentar ()
	{
		if(this.correr==true)
			System.out.println("O cavalo está correndo ");
		else
			System.out.println("Ué! O cavalo não está correndo");
	}
}
