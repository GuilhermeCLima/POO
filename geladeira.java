package POO;

public class geladeira {
	private String marca;
	private boolean porta = true;
	private int quant;
	private String cor;
	
	
	public geladeira(String marca,boolean porta,int quantidade,String cor) {
		this.marca = marca;
		this.porta = porta;
		this.quant = quantidade;
		this.cor = cor;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean getPorta() {
		return this.porta;
	}
	public void setPorta(boolean porta) {
		this.porta = porta;
	}
	public int getQuant() {
		return this.quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String teste() {
		if(this.porta == true) {
			return "Sua geladeira � de 2 portas";
		}
		else {
			return "Sua geladeira � de 1 porta";
		}
			
	}
	public void mostra() {
		System.out.println("A marca da sua geladeira �:" + marca);
		System.out.println(teste());
		System.out.println("A quantidade de litros que cabem na sua geladeira �:" + quant + "litros");
		System.out.println("A cor da sua geladeira �: " + cor);
	}
}
