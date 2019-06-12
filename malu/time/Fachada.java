package time;
import treinador.*;
import time.*;

public class Fachada {
		private CadastroTimes cadastroTimes;
	    private CadastroTreinadores cadastroTreinadores;
	    //private CadastroJogadores jogadores;
	    //private CadastroHabilidades habilidades;

	    public Fachada(RepositorioTime repositorioTime){
	        this.cadastroTimes = new CadastroTimes(repositorioTime);
	        this.cadastroTreinadores = new CadastroTreinadores(repositorioTreinadores);
	        //this.cadastroTreinadores = new CadastroTreinadores(repositorioTreinadores);
	    }

	    //Malu (Time)
	    public void cadastrarTime (Time time) throws TimeJaCadastradoException {
	        cadastroTimes.cadastrar(time);
	    }
	    public void removerTime (String nome) throws TimeNaoEncontradoException {
	        cadastroTimes.remover(nome);
	    }
	    public  void atualizarTime (String nome, Time time) throws TimeNaoEncontradoException {
	        cadastroTimes.atualizar(nome, time);
	    }
	    public void procurarTime (String nome) throws TimeNaoEncontradoException {
	        cadastroTimes.procurar(nome);
	    }
	    
	  //Henrique (Treinador)
	    public void cadastrarTreinador (Treinador treinador) throws TreinadorJaCadastradoException {
	        //Metodo exemplo, da aula 14
	        cadastroTreinadores.cadastrar(treinador);
	    }\
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
	    public void comprarJogador (Time time, Jogador jogador) throws VerbaInsuficienteException{
	        // double valorJogador = jogador.getValor();
	         * double verbaTime = time.getVerba();
	         * if (valorJogador < verbaTime){
	         * 		remover jogador do time de origem
	         * 		adicionar valor do jogador a verba do time de origem
	         * 		time.setVerba(verbaTime-valorJogador);
	         * } else {
	         * 		throws new VerbaInsuficienteException();
	         * }
	        //Método principal do projeto
	    }
	    public void atualizarInformações (){
	        //Método para atualizar idade, experiência, salário...
	    }
	    */

	}

