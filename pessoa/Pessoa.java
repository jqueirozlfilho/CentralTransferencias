package pessoa;
//TESTE
public abstract class Pessoa {
    private String nome;
    private int idade;
    private double salario;
    private String timeAtual;

    public Pessoa (){
        this.nome = "";
        this.idade = 0;
        this.salario = 0;
        this.timeAtual = null;
    }

    public Pessoa (String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public String getTimeAtual() {
        return timeAtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTimeAtual(String timeAtual) {
        this.timeAtual = timeAtual;
    }

    public abstract void calculaSalario (); //Implementar classe abstrata
}
