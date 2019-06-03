package treinador;

public class RegistroNaoEcontradoException extends Exception{
    public RegistroNaoEcontradoException(){
        super ("Registro não encontrado");
    }
}
