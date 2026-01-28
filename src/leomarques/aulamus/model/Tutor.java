package leomarques.aulamus.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tutor extends Pessoa{

	public Tutor() {}
	public Tutor(String cpf, String rg, String nome, String telefone, String email, int idade, String endereco) {
		super(cpf, rg, nome, telefone, email, idade, endereco);
		// TODO Auto-generated constructor stub
	}

	private List<Tutor> tutores = new ArrayList<Tutor>();
	
	//functions
	@Override
	public Tutor carregarPorCpf(String Cpf) {
		Tutor tutorCpf = new Tutor();
		for(Tutor tl : tutores) {
			if(tl.getCpf().equals(Cpf)) {
				tutorCpf = tl;
			}
		}
		
		return tutorCpf;
	}
	
	//CRUD
	public void criarTutor(String cpf, String rg, String nome, String telefone, 
			String email, int idade, String endereco) {
		
		Tutor nTutor = new Tutor();
		
		nTutor.setCpf(cpf);
		nTutor.setRg(rg);
		nTutor.setNome(nome);
		nTutor.setTelefone(telefone);
		nTutor.setEmail(email);
		nTutor.setIdade(idade);
		nTutor.setEndereco(endereco);
		
		tutores.add(nTutor);
		System.out.println("Tutor cadastrado!");
	}
	
	public List<Tutor> listarTutor() {
		List<Tutor> list = new ArrayList<Tutor>();
		
		list = tutores;
		
		return list;
	}
	public void alterarTutor(String cpf, String nome, String telefone, 
			String email, int idade, String endereco) {
		
		for(Tutor tl : tutores) {
			if(tl.getCpf().equals(cpf)) {
				tl.setNome(nome);
				tl.setTelefone(telefone);
				tl.setEmail(email);
				tl.setIdade(idade);
				tl.setEndereco(endereco);
				
				System.out.println("Tutor alterado.");
			}
		}
	}
	public void excluirTutor(String cpf) {
		Tutor delTutor = new Tutor();
		
		for (Tutor tl : tutores) {
			if(tl.getCpf().equals(cpf)) {
				delTutor = tl;
			}
		}
		
		tutores.remove(delTutor);
		System.out.println("Tutor removido com sucesso");
	}

}
