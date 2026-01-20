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
	
	//CRUD
	Scanner sc = new Scanner(System.in);
	List<Tutor> tutores = new ArrayList<Tutor>();
	
	public Tutor criarTutor() {
		Tutor nTutor = new Tutor();
		
		System.out.println("Digite seu nome: ");
		nTutor.setNome(sc.nextLine());
		System.out.println("Digite seu CPF: ");
		nTutor.setCpf(sc.next());
		System.out.println("Digite seu RG: ");
		nTutor.setRg(sc.next());
		System.out.println("Digite seu telefone: ");
		nTutor.setTelefone(sc.next());
		System.out.println("Digite seu email: ");
		nTutor.setEmail(sc.next());
		System.out.println("Digite sua idade: ");
		nTutor.setIdade(sc.nextInt());
		sc.nextLine();
		System.out.println("Digite seu endereço: ");
		nTutor.setEndereco(sc.nextLine());
		
		tutores.add(nTutor);
		System.out.println("Cadastro realizado com sucesso.");

		return nTutor;
	}
	public void listarTutor() {
		System.out.println("Tutotres cadastrados: ");
		for(Tutor t : tutores) {
			System.out.printf("Nome: %s"
					+ "%n%CPF: %s"
					+ "%nRG: %s"
					+ "%nTelefone: %s"
					+ "%nEmail: %s"
					+ "%nIdade: %d"
					+ "%nEndereço: %s"
					+ "", t.getNome(), t.getCpf(), t.getRg(), t.getTelefone(), t.getEmail(), t.getIdade(), t.getEndereco());
		}
	}
	public void alterarTutor(String cpf) {
		System.out.println("Digite os novos dados:");
		for(Tutor t : tutores) {
			if(t.getCpf().equals(cpf)) {
				System.out.println("Digite seu nome: ");
				t.setNome(sc.nextLine());
				System.out.println("Digite seu telefone: ");
				t.setTelefone(sc.next());
				System.out.println("Digite seu Email: ");
				t.setEmail(sc.next());
				System.out.println("Digite sua idade: ");
				t.setIdade(sc.nextInt());
				sc.nextLine();
				System.out.println("Digite seu endereço: ");
				t.setEndereco(sc.nextLine());
				
				System.out.println("Dados cadastrados com sucesso!");
			}
		}
	}
	public void excluirTutor(String cpf) {
		Tutor delTutor = new Tutor();
		
		for (Tutor t : tutores) {
			if(t.getCpf().equals(cpf)) {
				delTutor = t;
			}
		}
		
		tutores.remove(delTutor);
		System.out.println("Tutor removido com sucesso");
	}

}
