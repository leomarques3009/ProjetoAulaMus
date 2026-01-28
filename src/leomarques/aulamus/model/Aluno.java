package leomarques.aulamus.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa{
	private Tutor tutor;

	public Aluno() {}
	public Aluno(String cpf, String rg, String nome, String telefone, String email, int idade, String endereco,
			Tutor tutor) {
		super(cpf, rg, nome, telefone, email, idade, endereco);
		// TODO Auto-generated constructor stub
		this.tutor = tutor;
	}
	
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	//functions
	@Override
	public Aluno carregarPorCpf(String cpf) {
		Aluno alunoCpf = new Aluno();
		
		for(Aluno al : alunos) {
			if(al.getCpf().equals(cpf)) {
				alunoCpf = al;
			}
		}
		
		return alunoCpf;
	}
	public void meuTutor(Tutor tutor) {
		setTutor(tutor);
	}
	
	//CRUD
	public void criarAluno(String cpf, String rg, String nome, 
			String telefone, String email, int idade, String endereco) {
		Aluno nAluno = new Aluno();
		
		nAluno.setCpf(cpf);
		nAluno.setRg(rg);
		nAluno.setNome(nome);
		nAluno.setTelefone(telefone);
		nAluno.setEmail(email);
		nAluno.setIdade(idade);
		nAluno.setEndereco(endereco);
		
		alunos.add(nAluno);
		
		System.out.println("Aluno cadastrado!");
		
	}
	
	public List<Aluno> listarAluno() {
		List<Aluno> list = new ArrayList<Aluno>();
		
		list = alunos;
		
		return list;
	}
	
	public void alterarAluno(String cpf, String nome, String telefone, 
			String email, int idade, String endereco) {

		for(Aluno al : alunos) {
			if(al.getCpf().equals(cpf)) {
				al.setNome(nome);
				al.setTelefone(telefone);
				al.setEmail(email);
				al.setIdade(idade);
				al.setEndereco(endereco);
				
				System.out.println("Aluno alterado!");
			}
		}
	}
	
	public void excluirAluno(String cpf) {
		Aluno delAluno = new Aluno();
		for (Aluno al : alunos) {
			if(al.getCpf().equals(cpf)) {
				delAluno = al;
			}
		}
		
		alunos.remove(delAluno);
		
		System.out.println("Aluno excluído com sucesso!");
	}
	
	/*
	public Aula meuPlano() {
		Aula minhaAula = this.getAula();
		
		return minhaAula;
	}
	
	public Contrato meuContrato() {
		
	}
	*/

	//Getters & Setters
	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	
}
