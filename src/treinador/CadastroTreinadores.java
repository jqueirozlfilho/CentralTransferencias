package treinador;

public class CadastroTreinadores {
    private RepositorioTreinadores repositorioTreinadores;

    public CadastroTreinadores(RepositorioTreinadores repositorio){
        this.repositorioTreinadores = repositorio;
    }

    public void cadastrar (Treinador treinador) throws TreinadorJaCadastradoException{
        if(this.repositorioTreinadores.existe(treinador.getRegistroFifa()) == false){
            this.repositorioTreinadores.inserir(treinador.getNome(), treinador.getIdade(), treinador.getSalario(), treinador.getRegistroFifa(), treinador.getExperiencia());
        } else {
            throw new TreinadorJaCadastradoException();
        }
    }

    public void atualizaExperiencia(String registroFifa, int anoTemporada, int quantidaContratos){
        //Desenvolver alguma formula para alterar a experiencia dos treinadores
        //Em relação ao ano/temporada atual.
        Treinador treinadorAux = repositorioTreinadores.procurar(registroFifa);
        double experienciaAux = treinadorAux.getExperiencia() + (quantidaContratos / 5 * anoTemporada);
        repositorioTreinadores.atualizar(registroFifa, experienciaAux, treinadorAux.getIdade(), treinadorAux.getSalario());
    }
}
