package treinador;

public class RepositorioTreinadorArray implements RepositorioTreinadores{
    private Treinador[] treinador;
    private int indice;

    public RepositorioTreinadorArray(){
        this.treinador = new Treinador[5];
        indice = 0;
    }

    /*
    public void inserirRepositorioTreinador(String nome, int idade, double salario, String registroFifa, int experiencia){
        for(int i =0; i < 5; i++){
            treinador[i] = ;
        }
    }
    */

    @Override
    public void inserir(String nome, int idade, double salario, String registroFifa, double experiencia) {
        this.treinador[this.indice].setNome(nome);
        this.treinador[this.indice].setIdade(idade);
        this.treinador[this.indice].setSalario(salario);
        this.treinador[this.indice].setRegistroFifa(registroFifa);
        this.treinador[this.indice].setExperiencia(experiencia);
        indice++;
    }

    @Override
    public void atualizar(String registroFifa, double experiencia, int idade, double salario) {
        for(int i = 0; i < treinador.length; i++){
            if(this.treinador[i].getRegistroFifa().equals(registroFifa)){
                this.treinador[this.indice].setExperiencia(experiencia );
                this.treinador[this.indice].setIdade(idade);
                this.treinador[this.indice].setSalario(salario);
                i = treinador.length;
            }
        }
    }

    @Override
    public void remover(String registroFifa) {
        for(int i = 0; i < treinador.length; i++){
            if(treinador[i].getRegistroFifa().equals(registroFifa)){
                indice--;
                treinador[i] = treinador[indice];
            }
        }
    }

    @Override
    public Treinador procurar(String registroFifa) {
        for(int i = 0; i < treinador.length; i++){
            if(treinador[i].getRegistroFifa().equals(registroFifa)){
                return treinador[i];
            }
        }
        return null;
    }

    @Override
    public boolean existe(String registroFifa) {
        for(int i = 0; i < treinador.length; i++){
            if(this.treinador[i].getRegistroFifa().equals(registroFifa)){
                return true;
            }
        }
        return false;
    }
}
