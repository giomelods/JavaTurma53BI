package Heranca;

public class Preguica extends Animal {
	
	public boolean subir;
	@Override
	public void emitir()
	{
		System.out.println("não emite som");
	}
	
	public void subindo ()
	{
		if(this.subir==true)
			System.out.println("O Bicho Preguiça está subindo na árvore. Ual!!!");
		else
			System.out.println("Ué! O Bicho Preguiça não está subindo na árvore");
	}
}
