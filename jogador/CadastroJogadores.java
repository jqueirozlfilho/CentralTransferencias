package jogador;

public class CadastroJogadores {
	private RepositorioJogadores repositorioJogadores;
	
	public CadastroJogadores (RepositorioJogadores repositorio) {
		this.repositorioJogadores = repositorio;
	}
	public void cadastrar(Jogador jogador) throws JogadorJaCadastradoException, JogadorNaoEncontradoException {
		if (!this.repositorioJogadores.existe(jogador.getNome())) {
			this.repositorioJogadores.inserir(jogador);
		} else {
			throw new JogadorJaCadastradoException();
		}
	}
	public void remover(Jogador jogador) throws JogadorNaoEncontradoException {
		if (this.repositorioJogadores.existe(jogador.getNome()) == true) {
			this.repositorioJogadores.remover(jogador.getNome());
		} else {
			throw new JogadorNaoEncontradoException();
		}
	}
	public void atualizar(Jogador jogador) throws JogadorNaoEncontradoException {
		if (this.repositorioJogadores.existe(jogador.getNome()) == true) {
			this.repositorioJogadores.atualizar(jogador);
		} else {
			throw new JogadorNaoEncontradoException();
		}
	}
	public void procurar(Jogador jogador) throws JogadorNaoEncontradoException{
		if (this.repositorioJogadores.existe(jogador.getNome()) == true) {
			this.repositorioJogadores.procurar(jogador.getNome());
		} else {
			throw new JogadorNaoEncontradoException();
		}
	}
}
