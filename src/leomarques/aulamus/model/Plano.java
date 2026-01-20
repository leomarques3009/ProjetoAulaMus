package leomarques.aulamus.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plano {
	private int idPlano;
	private String periodo;
	private double desconto;

	Scanner sc = new Scanner(System.in);
	
	public Plano() {}
	
	public Plano(int idPlano, String periodo, double desconto) {
		this.setIdPlano(idPlano);
		this.setPeriodo(periodo);
		this.setDesconto(desconto);
	}

	//CRUD
	List<Plano> planos = new ArrayList<Plano>();
	int idNovo = 1;
	
	public void criarPlano() {
		Plano nPlano = new Plano();
		
		this.setIdPlano(idNovo);
		
		System.out.println("Vamos criar um novo Plano: ");
		System.out.println("Digite o tempo de Plano: ");
		nPlano.setPeriodo(sc.next());
		System.out.println("Digite o desconto: ");
		nPlano.setDesconto(sc.nextDouble());
		
		
		planos.add(nPlano);
		System.out.println("Cadastro realizado!!");
		
		idNovo ++;
	}
	public void listarPlanos() {
		System.out.println("Planos cadatrados");
		for(Plano p : planos) {
			System.out.println("==================");
			System.out.println("Período: " + p.getPeriodo()
					+ "\nDesconto: "+ p.getDesconto() +"%");
		}
	}
	public void alterarPlano(int idPlano) {
		for(Plano p : planos) {
			if(p.getIdPlano() == idPlano) {
				System.out.println("Digite o novo Período: ");
				p.setPeriodo(sc.next());
				System.out.println("Digite o novo desconto: ");
				p.setDesconto(sc.nextDouble());
				
				System.out.println("Plano alterado com sucesso;");
			}
		}
	}
	
	public void excluirPlano(int idPlano) {
		Plano delPlano = new Plano();
		for(Plano p : planos) {
			if(p.getIdPlano() == idPlano) {
				delPlano = p;
			}
		}
		planos.remove(delPlano);
		System.out.println("Plano excluido com sucesso!");
	}

	
	//Getters & Setters
	public int getIdPlano() {
		return idPlano;
	}

	public void setIdPlano(int idPlano) {
		this.idPlano = idPlano;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
}
