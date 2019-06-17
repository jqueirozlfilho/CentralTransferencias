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

        try {
            //Treinador do Barcelona
            fachada.cadastrarTreinador(new Treinador("Ernesto", 55, 9000, "02-E", 40));
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            //Treinador do Bayern
            fachada.cadastrarTreinador(new Treinador("Niko", 47, 8000, "03-N", 30));
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            //Treinador do City
            fachada.cadastrarTreinador(new Treinador("Guardiola", 48, 8000, "04-G", 50));
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
            System.out.println(fachada.procurarTreinador("02-E"));
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(fachada.procurarTreinador("03-N"));
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(fachada.procurarTreinador("04-G"));
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(fachada.procurarTreinador("05-T"));
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
