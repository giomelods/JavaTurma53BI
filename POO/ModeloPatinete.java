package POO;

public class ModeloPatinete {

	String cor;
	int quantPessoas;
	double peso;
	boolean andar;

		public void andar ()
		{
			if(this.andar==false)
				System.out.println("Pode andar com seu patinete meu querido");
			else
				System.out.println("Erro! se n�o tiver ningu�m para andar, n�o tem como meu senhor");
		}
		public void pessoa ()
		{
			this.andar=true;
		}
		public void ningu�m()
		{
			this.andar=false;
		}
		public void estadoAtual()
		{
			System.out.println("cor:    "+this.cor);
			System.out.println("limite de pessoas para andar"+this.quantPessoas);
			System.out.println("seu peso "+this.peso);

		}
	}
	
	
