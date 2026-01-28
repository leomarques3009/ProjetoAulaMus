package leomarques.aulamus.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula {
	private int idAula;
	private String instrumento;
	private String diaAula;
	private String horaAula;
	//private LocalDateTime diaAula;
	private double valHAula;
	private double valFinal;
	private String modalidade;
	private Plano plano;
	private Aluno aluno;
	private Professor professor;

	
	public Aula() {}
	public Aula(int idAula, String instrumento, String diaAula, String horaAula, double valHAula,
			String modalidade, Plano plano, Aluno aluno, Professor professor) {
		this.idAula = idAula;
		this.instrumento = instrumento;
		this.diaAula = diaAula;
		this.horaAula = horaAula;
		this.valHAula = valHAula;
		this.modalidade = modalidade;
		this.plano = plano;
		this.aluno = aluno;
		this.professor = professor;
	}

	//functions
	public Aula carregarPorId(int id) {
		Aula aulaId = new Aula();
		
		for(Aula al : aulas) {
			if(al.getIdAula() == id) {
				aulaId = al;
			}
		}
		
		return aulaId;
	}
	
	public double CalcMes(double valHAula, Plano plano) {
		double valFinal = (valHAula - valHAula*plano.getDesconto()/100)*4;
		
		return valFinal;
	}
	
	public void meuAluno(Aluno aluno) {
		setAluno(aluno);
	}
	public void meuProfessor(Professor professor) {
		setProfessor(professor);
	}
	
	
	private List<Aula> aulas = new ArrayList<Aula>();
	
	//CRUD
	int idNovo = 1;
	
	public void criarAula(String instrumento, String diaAula, String horaAula, double valHAula,
			String modalidade, Plano plano) {
		Aula nAula = new Aula();
		
		nAula.setIdAula(idNovo);
		nAula.setInstrumento(instrumento);
		nAula.setDiaAula(diaAula);
		nAula.setHoraAula(horaAula);
		nAula.setValHAula(valHAula);
		nAula.setModalidade(modalidade);
		nAula.setPlano(plano);
		nAula.setValFinal(CalcMes(nAula.getValHAula(), nAula.getPlano()));
		
		aulas.add(nAula);
		System.out.println("Aula cadastrada!");
		idNovo ++;
	}
	
	public List<Aula> listarAula() {
		List<Aula> list = new ArrayList<Aula>();
		
		list = aulas;
		
		return list;
	}
	
	public void alterarAula(int idAula, String instrumento, String diaAula, String horaAula, double valHAula,
			String modalidade) {
		for(Aula a : aulas) {
			if(a.getIdAula() == idAula) {
				a.setInstrumento(instrumento);
				a.setDiaAula(diaAula);        
				a.setHoraAula(horaAula);      
				a.setModalidade(modalidade);  
				a.setValHAula(valHAula);      
				a.setValFinal(CalcMes(a.getValHAula(), a.getPlano()));
				
				System.out.println("Aula alterada com suceso!");
			}
		}
	}
	
	public void excluirAula(int idAula) {
		Aula delAula = new Aula();
		for(Aula a : aulas) {
			if(a.getIdAula() == idAula) {
				delAula = a;
			}
		}
		
		aulas.remove(delAula);
		System.out.println("Aula excluida com sucesso!");
	}

	//Getters & Setters
	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public String getInstrumento() {
		return instrumento;
	}
	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}
	public String getDiaAula() {
		return diaAula;
	}
	public void setDiaAula(String diaAula) {
		this.diaAula = diaAula;
	}
	public String getHoraAula() {
		return horaAula;
	}
	public void setHoraAula(String horaAula) {
		this.horaAula = horaAula;
	}
	public double getValHAula() {
		return valHAula;
	}
	public void setValHAula(double valHAula) {
		this.valHAula = valHAula;
	}
	public double getValFinal() {
		return valFinal;
	}
	public void setValFinal(double valFinal) {
		this.valFinal = valFinal;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public Plano getPlano() {
		return plano;
	}
	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor; 
	}
	
	
}
