package treinador;

import pessoa.Pessoa;

public class Treinador extends Pessoa {
    private String registroFifa;
    private int experiencia;

    public Treinador (){
        super();
        this.registroFifa = "";
        this.experiencia = 0;
    }

    @Override
    public void calculaSalario() {

    }

    public Treinador (String nome, int idade, double salario, String registroFifa, int experiencia){
        super(nome, idade, salario);
        this.registroFifa = registroFifa;
        this.experiencia = experiencia;
    }

    public String getRegistroFifa() {
        return registroFifa;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setRegistroFifa(String registroFifa) {
        this.registroFifa = registroFifa;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
