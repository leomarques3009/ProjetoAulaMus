package leomarques.aulamus.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa{
	private String cnpj;

	public Professor(){}
	
	public Professor(String cpf, String rg, String nome, String telefone, String email, int idade, String endereco,
			String cnpj) {
		super(cpf, rg, nome, telefone, email, idade, endereco);
		// TODO Auto-generated constructor stub
		
		this.cnpj = cnpj;
	}

	/*
	public List<Aluno> meusAlunos(){
		
	}
	
	public meusHoraios() {
		
	}
	
	public Double calcMensal() {
		
	}
	
	public List<Contrato> meusContratos(){
		
	}*/
	
	//CRUD
	Scanner sc = new Scanner(System.in);
	List<Professor> professores = new ArrayList<Professor>();
	
	public void criarProfessor() {
		Professor nProfessor = new Professor();
		
		System.out.println("Digite seu nome: ");
		nProfessor.setNome(sc.nextLine());
		System.out.println("Digite seu CPF: ");
		nProfessor.setCpf(sc.next());
		System.out.println("Digite seu RG: ");
		nProfessor.setRg(sc.next());
		System.out.println("Digite seu CNPJ: ");
		nProfessor.setCnpj(sc.next());
		System.out.println("Digite seu telefone: ");
		nProfessor.setTelefone(sc.next());
		System.out.println("Digite seu email: ");
		nProfessor.setEmail(sc.next());
		System.out.println("Digite sua idade: ");
		nProfessor.setIdade(sc.nextInt());
		sc.nextLine();
		System.out.println("Digite seu endereço: ");
		nProfessor.setEndereco(sc.nextLine());
		
		professores.add(nProfessor);
		
		System.out.println("Cadastro realizado com sucesso.");
	}
	
	public void listarProfessor() {
		System.out.println("||Lista de Professores||");
		for(Professor p : professores) {
			System.out.println("======================");
			System.out.printf("CPF: %s"
					+ "%nRG: %s"
					+ "%nCNPJ: %s"
					+ "%nNome: %s"
					+ "%nTelefone: %s"
					+ "%nEmail: %s"
					+ "%nIdade: %d"
					+ "%nEndereço: %s"
					+ "", p.getCpf(), p.getRg(), p.getCnpj(), p.getNome(), p.getTelefone()
					, p.getEmail(), p.getIdade(), p.getEndereco());
		}
	}
	
	public void alterarProfessor(String cpf) {
		for(Professor p : professores) {
			if(p.getCpf().equals(cpf)) {
				System.out.println("Digite os novos dados:");
				
				System.out.println("Digite seu nome: ");
				p.setNome(sc.nextLine());
				System.out.println("Digite seu CNPJ: ");
				p.setCnpj(sc.next());
				System.out.println("Digite seu telefone: ");
				p.setTelefone(sc.next());
				System.out.println("Digite seu email: ");
				p.setEmail(sc.next());
				System.out.println("Digite sua idade: ");
				p.setIdade(sc.nextInt());
				sc.nextLine();
				System.out.println("Digite seu endereço: ");
				p.setEndereco(sc.nextLine());
				
				System.out.println("Dados alterados com sucesso.");
			}
		}
	}
	
	public void excluirProfessor(String cpf) {
		Professor delProfessor = new Professor();
		
		for(Professor p : professores) {
			if(p.getCpf().equals(cpf)) {
				delProfessor = p;
			}
		}
		
		professores.remove(delProfessor);
		System.out.println("Professor excluído com sucesso.");
	}
	
	
	//Getters & Setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	
}
