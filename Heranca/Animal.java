package Heranca;

public class Animal {

	public String nome;
	public int idade;
	public boolean som;

	
	public void emitir ()
	{
		if(this.som==true)
			System.out.println("O animal est� emitindo som");
		else
			System.out.println("U�! O animal n�o emite som");
	}
	public Animal() 
	{
		this.nome=nome;
		this.idade=idade;
	    this.som=true;
		
	}
	public void estadoAtual()
	{
		System.out.println("Nome:   "+this.nome);
		System.out.println("Idade:   "+this.idade);
		System.out.println("Est� emitindo som?   "+this.som);
	
	}
}