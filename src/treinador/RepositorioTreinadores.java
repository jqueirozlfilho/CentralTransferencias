package treinador;

public interface RepositorioTreinadores  {
    public void inserir (String nome, int idade, double salario, String registroFifa, double experiencia);

    public void atualizar (String registroFifa, double experiencia, int idade, double salario);

    public void remover (String registroFifa);

    public Treinador procurar (String registroFifa);

    public boolean existe (String registroFifa);
}
