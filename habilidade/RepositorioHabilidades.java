package habilidade;

public interface RepositorioHabilidades {
	
	public void inserir ( Habilidade habilidade);
	
	public void atualizar ( Habilidade habilidade); 
	
	public void remover (String nomeJogador); 
	
	public Habilidades procurar (String nomeJogador);

 	public boolean existe (String nomeJogador);
    
  
}
