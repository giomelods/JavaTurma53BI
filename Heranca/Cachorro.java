package Heranca;

public class Cachorro extends Animal {

	public boolean correr;
	
	@Override
	public void emitir()
	{
		System.out.println("Latir..");
	}
	
	public void movimentar ()
	{
		if(this.correr==true)
			System.out.println("O cachorro est� correndo ");
		else
			System.out.println("U�! O cachorro n�o est� correndo");
	}
}
