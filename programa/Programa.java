package programa;

import fachada.Fachada;
import treinador.*;

public class Programa {
    public static void main(String[] args) {
        RepositorioTreinadores repositorioTreinadores = new RepositorioTreinadorArray(10);
        Fachada fachada = new Fachada(repositorioTreinadores);
        //Cadastra os treinadores:
        try { //Treinador do Real Madrid
            Treinador zidane = new Treinador("Zidane", 46, 10000, "01-Z", 50);
            fachada.cadastrarTreinador(zidane);
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        try { //Treinador do Barcelona
            Treinador ernesto = new Treinador("Ernesto", 55, 9000, "02-E", 40);
            fachada.cadastrarTreinador(ernesto);
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        try { //Treinador do Bayern
            Treinador niko = new Treinador("Niko", 47, 8000, "03-N", 30);
            fachada.cadastrarTreinador(niko);
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        try { //Treinador do City
            Treinador guardiola = new Treinador("Guardiola", 48, 8000, "04-G", 50);
            fachada.cadastrarTreinador(guardiola);
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            //Treinador do PSG
            fachada.cadastrarTreinador(new Treinador("Thomas", 45, 7000, "05-T", 30));
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        //Testa metodo procurar:
        try {
            Treinador treinadorAux = fachada.procurarTreinador("01-Z");
            System.out.println(treinadorAux.getNome());
            System.out.println(treinadorAux.getIdade());
            System.out.println(treinadorAux.getSalario());
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Treinador treinadorAux = fachada.procurarTreinador("02-E");
            System.out.println(treinadorAux.getNome());
            System.out.println(treinadorAux.getIdade());
            System.out.println(treinadorAux.getSalario());
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Treinador treinadorAux = fachada.procurarTreinador("03-N");
            System.out.println(treinadorAux.getNome());
            System.out.println(treinadorAux.getIdade());
            System.out.println(treinadorAux.getSalario());
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Treinador treinadorAux = fachada.procurarTreinador("04-G");
            System.out.println(treinadorAux.getNome());
            System.out.println(treinadorAux.getIdade());
            System.out.println(treinadorAux.getSalario());
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Treinador treinadorAux = fachada.procurarTreinador("05-T");
            System.out.println(treinadorAux.getNome());
            System.out.println(treinadorAux.getIdade());
            System.out.println(treinadorAux.getSalario());
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
