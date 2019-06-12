package time;

import pessoa.Pessoa;
import jogador.RepositorioJogadores;
import treinador.Treinador;
import treinador.Treinador;

public class Time {
	private String nome;
	private double verbaTotal;
	private RepositorioJogadores[] jogadores;
	private Treinador treinador;
	
	public Time () {
		this.nome = null;
		this.verbaTotal = 0.00;
		this.jogadores = new RepositorioJogadores [20];
		this.treinador = null;
	}
	
	public Time (String nome, double verba, RepositorioJogadores[] jogadores, Treinador treinador) {
		this.nome = nome;
		this.verbaTotal = verba;
		this.jogadores = jogadores;
		this.treinador = treinador;
	}
	
	public String getNome () {
		return nome;
	}
	
	public double getVerba () {
		return verbaTotal;
	}
	
	public RepositorioJogadores[] getJogadores () {
		return jogadores;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setVerba (double verbaAtual) {
		this.verbaTotal = verbaAtual;
	}

}
