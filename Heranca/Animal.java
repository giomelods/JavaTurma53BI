package Heranca;

public class Animal {
	public String nome;
	public int idade;
	public boolean som;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isSom() {
		return som;
	}
	public void setSom(boolean som) {
		this.som = som;
	}
	
	public void emitir ()
	{
		if(this.som==true)
			System.out.println("O animal est� emitindo som");
		else
			System.out.println("U�! O animal n�o emite som");
	}

	public void estadoAtual()
	{
		System.out.println("Nome:   "+this.nome);
		System.out.println("Idade:   "+this.idade);
		System.out.println("Est� emitindo som?   "+this.som);
	    
	}
}