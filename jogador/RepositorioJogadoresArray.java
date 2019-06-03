package jogador;
import pessoa.Pessoa;
public class RepositorioJogadoresArray implements RepositorioJogadores{
	private Jogador [] jogador = new Jogador [100];
	private int indice = 0;

	public RepositorioJogadoresArray (String nome) {
		//this.jogador [0] = null;
	}

	public Jogador [] getJogadores() {
		return jogador;
	}

	public void setJogadores(Jogador [] jogador) {
		this.jogador = jogador;
	}

	public void inserir (String nome, int idade, double salario, int tempoDeContrato, double valor, double nota) {
		if (indice < this.jogador.length) {
			jogador [indice].setNome(nome);
			jogador [indice].setSalario(salario);
			jogador [indice].setIdade(idade);
			jogador [indice].setTempoDeContrato(tempoDeContrato);
			jogador [indice].setValor(valor);
			jogador [indice].setNota(nota);
			indice = indice + 1;
		}else {
			Jogador [] aux = new Jogador [(this.jogador.length + 1)*2];
			for (int c = 0; c < this.jogador.length; c++) {
				aux [c] = jogador [c];
			}
			jogador = aux;
			jogador [indice].setNome(nome);
			jogador [indice].setSalario(salario);
			jogador [indice].setIdade(idade);
			jogador [indice].setTempoDeContrato(tempoDeContrato);
			jogador [indice].setValor(valor);
			jogador [indice].setNota(nota);
			indice++;
		}
	}

	public void atualizar(Jogador jogador, String nome, int idade, double salario, int tempoDeContrato, double valor, double nota) throws JogadorNaoEncontradoException {
		for (int c = 0; c < this.jogador.length; c++) {
			if (this.jogador[c].getNome().equals(nome)) {
				this.jogador[c].setNome(nome);
				this.jogador[c].setIdade(idade);
				this.jogador[c].setSalario(salario);
				this.jogador[c].setTempoDeContrato(tempoDeContrato);
				this.jogador[c].setValor(valor);
				this.jogador[c].setNota(nota);
			}
		}
	}

	public void remover(Jogador jogador, String nome) throws JogadorNaoEncontradoException {
		for (int c = 0; c < this.jogador.length; c++) {
			if (this.jogador[c].getNome().equals(nome)) {
				indice--;
				this.jogador[c] = this.jogador[indice];
			}
		}
	}

	public Jogador procurar(Jogador jogador, String nome) throws JogadorNaoEncontradoException {
		for (int c = 0; c < this.jogador.length; c++) {
			if (this.jogador[c].getNome().equals(nome)) {
				return this.jogador[c];
			} 
		}
		return this.jogador[indice];
	}

	public boolean existe(Jogador jogador, String nome) throws JogadorNaoEncontradoException {
		for (int c = 0; c < this.jogador.length; c++) {
			if (this.jogador[c].getNome().equals(nome)) {
				return true;
			} 
		}
		return false;
	}

}
