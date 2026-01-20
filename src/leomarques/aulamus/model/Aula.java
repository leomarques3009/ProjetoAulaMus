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
	Plano plano;
	Aluno aluno;

	Scanner sc = new Scanner(System.in);
	
	public Aula() {}
	public Aula(int idAula, String instrumento, String diaAula, String horaAula, double valHAula,
			String modalidade, Plano plano, Aluno aluno) {
		this.idAula = idAula;
		this.instrumento = instrumento;
		this.diaAula = diaAula;
		this.horaAula = horaAula;
		this.valHAula = valHAula;
		this.modalidade = modalidade;
		this.plano = plano;
		this.aluno = aluno;
	}

	//functions
	public double CalcMes(double valHAula, Plano plano) {
		double valFinal = (valHAula - valHAula*plano.getDesconto())*4;
		
		return valFinal;
	}
	public Plano meuPlano() {
		Plano aulaPlano = new Plano();
		aulaPlano.listarPlanos();
		
	}
	public Aluno meuAluno() {
		
	}
	
	
	//CRUD
	List<Aula> aulas = new ArrayList<Aula>();
	int idNovo = 1;
	
	public void criarAula() {
		Aula nAula = new Aula();
		
		nAula.setIdAula(idNovo);
		System.out.println("Digite o instrumento: ");
		nAula.setInstrumento(sc.next());
		System.out.println("Digite o dia da aula:");
		nAula.setDiaAula(sc.next());
		System.out.println("Digite o horário da aula");
		nAula.setHoraAula(sc.next());
		System.out.println("Digite a modalidade: ");
		nAula.setModalidade(sc.next());
		System.out.println("Digite o valor da Hora/aula: ");
		nAula.setValHAula(sc.nextDouble());
		nAula.setPlano(meuPlano());
		nAula.setAluno(meuAluno());
		nAula.setValFinal(CalcMes(nAula.getValHAula(), nAula.getPlano()));
		
		aulas.add(nAula);
		System.out.println("Cadastro realizado com suceso");
		idNovo ++;
	}
	
	public void listarAula() {
		System.out.println("Aulas cadastradas:");
		
		for(Aula a : aulas) {
			System.out.printf("%nInstrumento: %s"
					+ "%nDia: %s"
					+ "%nHora: %s"
					+ "%nModalidade: %s"
					+ "%nAluno: %s"
					+ "%nPlano: %s"
					+ "%nValor mensal: R$%.2f"
					+ "", a.getInstrumento(), a.getDiaAula(), a.getHoraAula(), a.getModalidade(), a.getAluno().getNome()
					, a.getPlano().getPeriodo(), a.getValFinal());
		}
	}
	
	public void alterarAula(int idAula) {
		for(Aula a : aulas) {
			if(a.getIdAula() == idAula) {
				System.out.println("Digite o instrumento: ");
				a.setInstrumento(sc.next());
				System.out.println("Digite o dia da aula:");
				a.setDiaAula(sc.next());
				System.out.println("Digite o horário da aula");
				a.setHoraAula(sc.next());
				System.out.println("Digite a modalidade: ");
				a.setModalidade(sc.next());
				System.out.println("Digite o valor da Hora/aula: ");
				a.setValHAula(sc.nextDouble());
				a.setPlano(meuPlano());
				a.setAluno(meuAluno());
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
		
	}
	
	
}
