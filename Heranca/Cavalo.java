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
			System.out.println("O cavalo est� correndo ");
		else
			System.out.println("U�! O cavalo n�o est� correndo");
	}
}
