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
	

	private List<Plano> planos = new ArrayList<Plano>();
	int idNovo = 1;

	//functions
	public Plano carregarPorID(int idPlano) {
		Plano rPlano = new Plano();
		
		for(Plano pl : this.planos) {
			if(pl.getIdPlano() == idPlano) {
				rPlano = pl;
			}
		}
		
		return rPlano;
	}
	
	//CRUD
	public void criarPlano(String periodo, double desconto) {
		Plano nPlano = new Plano();
		
		nPlano.setIdPlano(idNovo);
		
		nPlano.setPeriodo(periodo);
		nPlano.setDesconto(desconto);
		
		planos.add(nPlano);
		System.out.println("Plano Cadastrado!");
		
		idNovo ++;
	}
	public List<Plano> listarPlanos() {
		List<Plano> list = new ArrayList<Plano>();
		list = this.planos;
		
		return list;
		
	}
	public void alterarPlano(int idPlano, String periodo, double desconto) {
		for(Plano p : planos) {
			if(p.getIdPlano() == idPlano) {
				p.setPeriodo(periodo);
				p.setDesconto(desconto);
				
				System.out.println("Plano alterado com sucesso!");
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
