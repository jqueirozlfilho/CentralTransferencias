package treinador;

public class TreinadorJaCadastradoException extends Exception{
    public TreinadorJaCadastradoException(){
        super("Treinador já cadastrado");
    }
}
