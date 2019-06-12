package treinador;

public class TreinadorNaoEcontradoException extends Exception{
    public TreinadorNaoEcontradoException(){
        super ("Registro não encontrado");
    }
}
