import java.util.Calendar;
package herança;

public class Aluno extends Pessoa {
    // atributos
    private String matricula;

    // metodos
    public Aluno(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
    }
}