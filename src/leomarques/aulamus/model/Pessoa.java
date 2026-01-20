package leomarques.aulamus.model;

public class Pessoa {
	private String cpf;
	private String rg;
	private String nome;
	private String telefone;
	private String email;
	private int idade;
	private String endereco;
	private Aula aula;
	
	public Pessoa() {}
	public Pessoa(String cpf, String rg, String nome, String telefone, String email, int idade, String endereco) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	//Getters & Setters
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Aula getAula() {
		return aula;
	}
	public void setAula(Aula aula) {
		this.aula = aula;
	}
	
}
