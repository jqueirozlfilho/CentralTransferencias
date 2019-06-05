package treinador;

public class RepositorioTreinadorLista implements RepositorioTreinadores{
    private Treinador treinador;
    private RepositorioTreinadorLista proximo;

    public RepositorioTreinadorLista(){
        this.treinador = null;
        this.proximo = null;
    }

    @Override
    public void inserir(String nome, int idade, double salario, String registroFifa, double experiencia) {
        if(this.proximo == null){
            this.treinador.setNome(nome);
            this.treinador.setIdade(idade);
            this.treinador.setSalario(salario);
            this.treinador.setRegistroFifa(registroFifa);
            this.treinador.setExperiencia(experiencia);
            this.proximo = new RepositorioTreinadorLista();
        } else {
            this.proximo.inserir(nome, idade, salario, registroFifa, experiencia);
        }
    }

    //Teste:
    public void inserir(Treinador treinador) {
        if(this.proximo == null){
            this.treinador.setNome(treinador.getNome());
            this.treinador.setIdade(treinador.getIdade());
            this.treinador.setSalario(treinador.getSalario());
            this.treinador.setRegistroFifa(treinador.getRegistroFifa());
            this.treinador.setExperiencia(treinador.getExperiencia());
            this.proximo = new RepositorioTreinadorLista();
        } else {
            this.proximo.inserir(treinador);
        }
    }
    //

    @Override
    public void atualizar(String registroFifa, double experiencia, int idade, double salario){
        if(this.treinador.getRegistroFifa().equals(registroFifa)){
            this.treinador.setExperiencia(experiencia);
            this.treinador.setIdade(idade);
            this.treinador.setSalario(salario);
        } else {
            this.proximo.atualizar(registroFifa, experiencia, idade, salario);
        }
    }

    @Override
    public void remover(String registroFifa){
        if(this.treinador.getRegistroFifa().equals(registroFifa)){
            this.treinador = this.proximo.treinador;
            this.proximo = this.proximo.proximo;
        } else {
            this.proximo.remover(registroFifa);
        }
    }

    @Override
    public Treinador procurar(String registroFifa){
        if(this.treinador.getRegistroFifa().equals(registroFifa)){
            return this.treinador;
        } else {
            this.proximo.procurar(registroFifa);
        }
        return null;
    }

    @Override
    public boolean existe(String registroFifa) {
        if(this.treinador != null){
            if(this.treinador.getRegistroFifa().equals(registroFifa)){
                return true;
            } else {
                this.proximo.existe(registroFifa);
            }
        }
        return false;
    }
}
