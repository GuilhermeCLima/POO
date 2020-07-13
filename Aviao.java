package POO;

public class Aviao {
	private int passageiros;
	private String cor;
	private int velocidade;
	private String modelo;
	
	public Aviao(int passageiros, String cor, int velocidade, String modelo) {
		
		this.passageiros = passageiros;
		this.cor = cor;
		this.velocidade = velocidade;
		this.modelo = modelo;
		
	}

	public int getPassageiros() {
		return this.passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVelocidade() {
		return this.velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo( String modelo) {
		this.modelo = modelo;
	}
	public void mostrinfo() {
		System.out.println("A quantidade de passageiros �: " + passageiros);
		System.out.println("A cor do avi�o �: " + cor);
		System.out.println("A velocidade do avi�o �: " + velocidade);
		System.out.println("O modelo �: " + modelo);
	}
}
