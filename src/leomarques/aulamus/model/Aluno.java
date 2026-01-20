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
	
	//CRUD
	Scanner sc = new Scanner(System.in);
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void criarAluno() {
		Aluno nAluno = new Aluno();
		Tutor meuTutor = new Tutor();
		
		System.out.println("Digite seu nome: ");
		nAluno.setNome(sc.nextLine());
		System.out.println("Digite seu CPF: ");
		nAluno.setCpf(sc.next());
		System.out.println("Digite seu RG: ");
		nAluno.setRg(sc.next());
		System.out.println("Digite seu Telefone: ");
		nAluno.setTelefone(sc.next());
		System.out.println("Digite seu email: ");
		nAluno.setEmail(sc.next());
		System.out.println("Digite sua idade: ");
		nAluno.setIdade(sc.nextInt());
		sc.nextLine();
		System.out.println("Digite seu endereço: ");
		nAluno.setEndereco(sc.nextLine());
		
		if(nAluno.getIdade() < 18) {
			System.out.println("Cadastre os dados do seu Responsável: ");
			meuTutor = meuTutor.criarTutor();//isso aqui é feio kkkk
			
			nAluno.setTutor(meuTutor);
		}
		
		alunos.add(nAluno);
		
		System.out.println("Aluno cadastrado com sucesso!!");
		
	}
	
	public void listarAluno() {
		System.out.println("Alunos cadastrados: ");
		for(Aluno a : alunos) {
			System.out.printf("Nome: %s"
					+ "%nCPF: %s"
					+ "%nRG: %s"
					+ "%nTelefone: %s"
					+ "%nEmail: %s"
					+ "%nIdade: %d"
					+ "%nEndereço: %s"
					+ "", a.getNome(), a.getCpf(), a.getRg(), a.getTelefone(), a.getEmail(), a.getIdade(), a.getEndereco());
			
			if(a.getIdade() < 18) {
				System.out.println("Responsável: " + a.getTutor().getNome());
			}
		}
	}
	
	public void alterarAluno(String cpf) {
		System.out.println("Digite os  novos dados: ");
		for(Aluno a : alunos) {
			if(a.getCpf().equals(cpf)) {
				System.out.println("Digite seu nome: ");
				a.setNome(sc.next());
				System.out.println("Digite seu telefone: ");
				a.setTelefone(sc.next());
				System.out.println("Digit seu Email: ");
				a.setEmail(sc.next());
				System.out.println("Digite sua idade: ");
				a.setIdade(sc.nextInt());
				sc.nextLine();
				System.out.println("Digite seu endereço: ");
				a.setEndereco(sc.nextLine());
				
				if(a.getIdade() < 18 || a.getTutor() != null) {
					String escolha;
					String cpfTutor;
					Tutor meuTutor = new Tutor();
					
					System.out.println("Deseja alterar os dados do Responsável: Digite \"Sim\" ou \"Nao\"");
					escolha = sc.next();
					if(escolha.equalsIgnoreCase("sim")){
						meuTutor = a.getTutor();
						cpfTutor = a.getTutor().getCpf();
						meuTutor.alterarTutor(cpfTutor);
					}
				}
				
				System.out.println("Dados de Aluno alterado com sucesso!");
			}
		}
	}
	
	public void excluirAluno(String cpf) {
		Aluno delAluno = new Aluno();
		for (Aluno a : alunos) {
			if(a.getCpf().equals(cpf)) {
				delAluno = a;
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
