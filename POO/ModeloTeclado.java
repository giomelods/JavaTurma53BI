package POO;

public class ModeloTeclado {

	String cor;
	int teclas;
	boolean energia;

    public ModeloTeclado()
    {
    	this.energia=true;
    }
	
	public void digitar ()
	{
		if(this.energia==true)
			System.out.println("Digitando");
		else
			System.out.println("Erro! Ligue o teclado na tomada fofo");
	}
	public void ligar ()
	{
		this.energia=true;
	}
	public void desligar()
	{
		this.energia=false;
	}
	public void estadoAtual()
	{
		System.out.println("cor:    "+this.cor);
		System.out.println("teclas  "+this.teclas);
		System.out.println("está ligada? "+this.energia);

	}
}
