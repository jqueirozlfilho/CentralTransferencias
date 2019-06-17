package treinador;

public class RepositorioTreinadorArray implements RepositorioTreinadores{
    private Treinador[] treinador;
    private int indice;

    public RepositorioTreinadorArray(int tamanho){
        this.treinador = new Treinador[tamanho];
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
    public void inserir(Treinador treinador) {
        if(indice < this.treinador.length) {
            this.treinador[this.indice] = treinador;
            /*
            this.treinador[this.indice].setNome(treinador.getNome());
            this.treinador[this.indice].setIdade(treinador.getIdade());
            this.treinador[this.indice].setSalario(treinador.getSalario());
            this.treinador[this.indice].setRegistroFifa(treinador.getRegistroFifa());
            this.treinador[this.indice].setExperiencia(treinador.getExperiencia());
            indice++;
            */
            indice++;
        } else {
            Treinador[] aux = new Treinador[(this.treinador.length+1)*2];
            for (int i = 0; i < this.treinador.length; i++){
                aux[i] = this.treinador[i];
            }
            this.treinador = aux;
            this.treinador[this.indice].setNome(treinador.getNome());
            this.treinador[this.indice].setIdade(treinador.getIdade());
            this.treinador[this.indice].setSalario(treinador.getSalario());
            this.treinador[this.indice].setRegistroFifa(treinador.getRegistroFifa());
            this.treinador[this.indice].setExperiencia(treinador.getExperiencia());
            indice++;
        }
    }

    @Override
    public void atualizar(Treinador treinador) {
        for(int i = 0; i < this.treinador.length; i++){
            if(this.treinador[i].getRegistroFifa().equals(treinador.getRegistroFifa())){
                this.treinador[this.indice].setExperiencia(treinador.getExperiencia());
                this.treinador[this.indice].setIdade(treinador.getIdade());
                this.treinador[this.indice].setSalario(treinador.getSalario());
                i = this.treinador.length;
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
        for(int i = 0; i < getIndice(); i++){
            if(this.treinador[i].getRegistroFifa().equals(registroFifa)){
                return treinador[i];
            }
        }
        return null;
    }

    @Override
    public boolean existe(String registroFifa) {
        int auxIndice = getIndice();
        if(auxIndice != 0){
            for(int i = 0; i < auxIndice; i++){
                return true;
            }
        }
        return false;
    }

    public int getIndice() {
        return indice;
    }
}
