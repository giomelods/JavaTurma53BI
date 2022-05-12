package Heranca;

public class Animal {

	public String nome;
	public int idade;
	public boolean som;

	
	public void emitir ()
	{
		if(this.som==true)
			System.out.println("O animal está emitindo som");
		else
			System.out.println("Ué! O animal não emite som");
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
		System.out.println("Está emitindo som?   "+this.som);
	
	}
}