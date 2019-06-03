package jogador;

public class RepositorioJogadoresLista implements RepositorioJogadores {
	private Jogador jogador;
	private RepositorioJogadoresLista proximo;

	public RepositorioJogadoresLista() {
		this.jogador = null;
	}

	public Jogador getJogadores() {
		return jogador;
	}

	public void setJogadores(Jogador jogadores) {
		this.jogador = jogadores;
	}
	public void inserir (String nome, int idade, double salario, int tempoDeContrato, double valor, double nota) {
		if (this.proximo == null) {
			this.jogador.setNome(nome);
			this.jogador.setSalario(salario);
			this.jogador.setIdade(idade);
			this.jogador.setTempoDeContrato(tempoDeContrato);
			this.jogador.setValor(valor);
			this.jogador.setNota(nota);
			this.proximo = new RepositorioJogadoresLista();
		} else {
			this.proximo.inserir(nome, idade, salario, tempoDeContrato, valor, nota);
		}
	}

	public void atualizar(Jogador jogador, String nome, int idade, double salario, int tempoDeContrato, double valor, double nota) throws JogadorNaoEncontradoException {
		if (this.jogador.getNome().equals(nome)) {
			this.jogador.setIdade(idade + 1);
			this.jogador.setTempoDeContrato(tempoDeContrato);
			this.jogador.setSalario(salario);
			this.jogador.setValor(valor);
			this.jogador.setNota(nota);
		} else {
			this.proximo.atualizar(jogador, nome, idade, salario, tempoDeContrato, valor, nota);
		}
	}

	public void remover(Jogador jogador, String nome) throws JogadorNaoEncontradoException {
		if (this.jogador.getNome().equals(nome)) {
			this.jogador = this.proximo.jogador;
			this.proximo = this.proximo.proximo;
		} else {
			this.proximo.remover(jogador, nome);
		}
	}

	public Jogador procurar(Jogador jogador, String nome) {
		if (this.jogador.getNome().equals(nome)) {
			return this.jogador;
		} else {
			return this.proximo.procurar(jogador, nome);
		}
	}

	public boolean existe(Jogador jogador, String nome) throws JogadorNaoEncontradoException {
		if (this.proximo == null) {
			if (this.jogador.getNome().equals(nome)) {
				return true;
			} else {
				return false;
			}
		}
		if (this.jogador.getNome().equals(nome)) {
			return true;
		} else {
			return this.proximo.existe(jogador, nome);
		}
	}

}
