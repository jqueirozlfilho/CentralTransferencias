package treinador;

public interface RepositorioTreinadores  {
    public void inserir (String nome, int idade, double salario, String registroFifa, int experiencia);

    public void atualizar (String registroFifa, int experiencia, int idade, double salario);

    public void remover (String registroFifa);

    public Treinador procurar (String registroFifa);

    public boolean existe (String registroFifa);
}
