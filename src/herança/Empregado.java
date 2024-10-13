package herança;

import java.util.Calendar;

public class Empregado extends Pessoa {
    // atributos
    protected String matricula;
    private Calendar data_admisao, data_demissao;

    // métodos
    public Empregado(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
        this.matricula = gerarMatricula();
        data_admisao = Calendar.getInstance();
    }

    public void demitirEmpregado() {
        data_demissao = Calendar.getInstance();
    }

    protected String gerarMatricula() {
        this.matricula = "Matricula não definida.";
    }

    protected String recuperarMatricula() {
        return this.matricula;
    }
}
