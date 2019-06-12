package time;

public interface RepositorioTime {
	
	public void inserir (Time time);
	
	public void remover (String nome);
	
	public Time procurar (String nome);
	
	public boolean existe (String nome);

	public void atualizar(String nome, Time time);
}
