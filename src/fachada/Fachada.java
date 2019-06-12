package fachada;

import treinador.*;

public class Fachada {
    //private CadastroTimes times;
    private CadastroTreinadores cadastroTreinadores;
    //private CadastroJogadores jogadores;
    //private CadastroHabilidades habilidades;

    public Fachada(RepositorioTreinadores repositorioTreinadores){
        this.cadastroTreinadores = new CadastroTreinadores(repositorioTreinadores);
    }

//Henrique (Treinador)
    public void cadastrarTreinador (Treinador treinador) throws TreinadorJaCadastradoException {
        //Metodo exemplo, da aula 14
        cadastroTreinadores.cadastrar(treinador);
    }
    public void removerTreinador (Treinador treinador) throws TreinadorNaoEcontradoException {
        cadastroTreinadores.remover(treinador);
    }
    public  void atualizarTreinador (Treinador treinador) throws TreinadorNaoEcontradoException {
        cadastroTreinadores.atualizar(treinador);
    }
    public void procurarTreinador (Treinador treinador) throws TreinadorNaoEcontradoException {
        cadastroTreinadores.procurar(treinador);
    }

    /*
    public void comprarJogador (){
        //Método principal do projeto
    }

    public void atualizarInformações (){
        //Método para atualizar idade, experiência, salário...
    }
    */

}
