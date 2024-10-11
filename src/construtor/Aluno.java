package construtor;

//Exemplo utilizando construtor
import java.util.Random;

public class Aluno {
    // atributos
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;

    // construtor
    public Aluno(String nome, int idade) {
        Aluno novoAluno = new Aluno("teste de instancição", 50)
        aleatorio = new Random();
        this.nome = nome;
        this.idade = idade;
        this.codigo_identificador = aleatorio.nextDouble();
    }

    // métodos
    public void definirNome(String nome) {
        this.nome = nome;
    }

    public void definirIdade(int idade) {
        this.idade = idade;
    }
}