package POO;

public class Cliente {
	private String nome;
	private String rua;
	private String cep;
	private String email;
	
	
	public Cliente (String nome, String rua , String cep , String email) {
		
		this.nome = nome;
		this.rua = rua;
		this.cep = cep;
		this.email = email;
		
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRua() {
		return this.rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void mostrarCliente() {
		
		System.out.println("cliente: " + this.nome);
		System.out.println("rua: " + this.rua);
		System.out.println("Seu cep: " + this.cep);
		System.out.println("Seu email: " + this.email);
		
		
	}
	

}

