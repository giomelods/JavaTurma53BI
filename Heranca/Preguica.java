package Heranca;

public class Preguica extends Animal {
	
	public boolean subir;
	@Override
	public void emitir()
	{
		System.out.println("n�o emite som");
	}
	
	public void subindo ()
	{
		if(this.subir==true)
			System.out.println("O Bicho Pregui�a est� subindo na �rvore. Ual!!!");
		else
			System.out.println("U�! O Bicho Pregui�a n�o est� subindo na �rvore");
	}
}
