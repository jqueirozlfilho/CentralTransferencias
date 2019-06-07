package jogador;

public class CadastroJogadores {
	private RepositorioJogadores RepositorioJogadores;
	
	public CadastroJogadores (RepositorioJogadores repositorio) {
		this.RepositorioJogadores = repositorio;
	}
	public void cadastrar(Jogador jogador) throws JogadorJaCadastradoException, JogadorNaoEncontradoException {
		if (!this.RepositorioJogadores.existe(jogador.getNome())) {
			this.RepositorioJogadores.inserir(jogador);
		} else {
			throw new JogadorJaCadastradoException();
		}
	}
	
}
