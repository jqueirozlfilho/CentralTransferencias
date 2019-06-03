package jogador;

import pessoa.Pessoa;

public class Jogador extends Pessoa{
	private int tempoDeContrato;
	private double valor;
	private Pessoa pessoa;
	private double nota;
	
	public Jogador(String nome, int idade, double salario, int tempoDeContrato, double valor, double nota) {
		super (nome, idade, nota);
		this.tempoDeContrato = 0;
		this.valor = 0;
		this.setPessoa(null);
		this.nota = 0;
	}
	public int getTempoDeContrato() {
		return this.tempoDeContrato;
	}
	public void setTempoDeContrato (int contrato) {
		this.tempoDeContrato = contrato;
	}
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
/*	public Habilidades getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(Habilidades habilidades) {
		this.habilidades = habilidades;
	}*/
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
/*
class Habilidades extends Jogador {
	private int notaTotal;
	private int finalizações;
	private int passes;
	private int interceptações;
	
	public Habilidades() {
		this.notaTotal = 0;
		this.finalizações = 0;
		this.passes = 0;
		this.interceptações = 0;
	}
	public int getNotaTotal() {
		return this.notaTotal;
	}
	public void setNotaTotal (int nota) {
		this.notaTotal = nota;
	}
	public int getFinalizações() {
		return this.finalizações;
	}
	public void setFinalizações (int finalizações) {
		this.finalizações = finalizações;
	}
	public int getPasses() {
		return this.passes;
	}
	public void setPasses (int passes) {
		this.passes = passes;
	}
	public int getInterceptações() {
		return this.interceptações;
	}
	public void setInterceptações (int interceptações) {
		this.interceptações = interceptações;
	}
}*/
