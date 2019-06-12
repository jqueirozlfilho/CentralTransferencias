package fachada;

import treinador.*;
import jogador.*;
import time.*;

public class Fachada {
    private CadastroTimes times;
    private CadastroTreinadores cadastroTreinadores;
    private CadastroJogadores jogadores;
    //private CadastroHabilidades habilidades;

    public Fachada(RepositorioTreinadores repositorioTreinadores){
        this.cadastroTreinadores = new CadastroTreinadores(repositorioTreinadores);
    }

//Henrique (Treinador)
    public void cadastrarTreinador (Treinador treinador) throws TreinadorJaCadastradoException {
        //Metodo exemplo, da aula 14
        cadastroTreinadores.cadastrar(treinador);
    }
    public  void atualizarTreinador (Treinador treinador) throws TreinadorNaoEncontradoException {
        cadastroTreinadores.atualizar(treinador);
    }
    public void removerTreinador (String registroFifa) throws TreinadorNaoEncontradoException {
        cadastroTreinadores.remover(registroFifa);
    }
    public Treinador procurarTreinador (String registroFifa) throws TreinadorNaoEncontradoException {
        return cadastroTreinadores.procurar(registroFifa);
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
