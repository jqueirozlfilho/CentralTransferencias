package treinador;

public class TreinadorNaoEncontradoException extends Exception{
    public TreinadorNaoEncontradoException(){
        super ("Registro não encontrado");
    }
}
