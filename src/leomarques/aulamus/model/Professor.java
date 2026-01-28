package leomarques.aulamus.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa{
	private String cnpj;

	public Professor(){}
	
	public Professor(String cpf, String rg, String nome, String telefone, String email, int idade, String endereco, String cnpj) {
		super(cpf, rg, nome, telefone, email, idade, endereco);
		// TODO Auto-generated constructor stub
		
		this.cnpj = cnpj;
	}

	private List<Professor> professores = new ArrayList<Professor>();
	
	//functions
	@Override
	public Professor carregarPorCpf(String cpf) {
		Professor profCpf = new Professor();
		
		for(Professor pl : professores) {
			if(pl.getCpf().equals(cpf)) {
				profCpf = pl;
			}
		}
		
		return profCpf;
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
	
	public void criarProfessor(String cnpj, String cpf, String rg, String nome, String telefone, 
			String email, int idade, String endereco) {
		Professor nProfessor = new Professor();
		
		nProfessor.setCnpj(cnpj);
		nProfessor.setCpf(cpf);
		nProfessor.setRg(rg);
		nProfessor.setNome(nome);
		nProfessor.setTelefone(telefone);
		nProfessor.setEmail(email);
		nProfessor.setIdade(idade);
		nProfessor.setEndereco(endereco);
		
		professores.add(nProfessor);
		
		System.out.println("Professor Cadastrado!");
	}
	
	public List<Professor> listarProfessor() {
		List<Professor> list = new ArrayList<Professor>();
		
		list = professores;
		
		return list;
		
	}
	
	public void alterarProfessor(String cpf, String cnpj, String nome, String telefone
			, String email, int idade, String endereco) {
		for(Professor pl : professores) {
			if(pl.getCpf().equals(cpf)) {
				
				pl.setCnpj(cnpj);
				pl.setNome(nome);
				pl.setTelefone(telefone);
				pl.setEmail(email);
				pl.setIdade(idade);
				pl.setEndereco(endereco);
				
				System.out.println("Professor Alterado.");
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
