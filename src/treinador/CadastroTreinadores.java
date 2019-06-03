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

    public void atualizaExperiencia(int anoTemporada){
        //Desenvolver alguma formula para auterar a experiencia dos treinadores
        //Em relação ao ano/temporada atual.
    }
}
