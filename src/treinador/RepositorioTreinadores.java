package treinador;

public interface RepositorioTreinadores  {
    public void inserir (Treinador treinador);

    public void atualizar (Treinador treinador);

    public void remover (String registroFifa);

    public Treinador procurar (String registroFifa);

    public boolean existe (String registroFifa);
}
