package jogador;

public interface RepositorioJogadores {
	public void inserir (String nome, int idade, double salario, int tempoDeContrato, double valor, double nota);
	
	public void atualizar (Jogador jogador, String nome, int idade, double salario, int tempoDeContrato, double valor, double nota)
		throws JogadorNaoEncontradoException;
	
	public void remover (Jogador jogador, String nome) 
		throws JogadorNaoEncontradoException;
	
	public Jogador procurar (Jogador jogador, String nome)
		throws JogadorNaoEncontradoException;
	
	public boolean existe (Jogador jogador, String nome)
		throws JogadorNaoEncontradoException;
}
