package herança;
import java.sql.Date;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;

public class Pessoa {
    // atributos
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long CPF;
    private Endereco endereco;

    // metodos
    public Pessoa(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        atualizarIdade();
    }

    protected void atualizarNone(String nome) {
        this.nome = nome;
    }

    protected String recuperarNome() {
        return this.nome;
    }

    protected void atualizarIdade() {
        this.idade = calcularIdade();
    }

    protected int recuperarIdade() {
        return this.idade;
    }

    protected void atualizarCPF(long CPF) {
        this.CPF = CPF;
    }

    protected long recuperarCPF() {
        return this.CPF;
    }

    protected void atualizarEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    protected Endereco recuperarEndereco() {
        return this.endereco;
    }

    private int calcularIdade() {
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(Year) - data_nascimento.get(Year);
        if ((data_nascimento.get(Month) > hoje.get(Month))
                || (data_nascimento.get(Month) == hoje.get(Month) && data_nascimento.get(Date) > hoje.get(Date)))
            lapso--;
        return lapso;
    }
}

class Empregado extends Pessoa {
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
class Aluno extends Pessoa {
    // atributos
    private String matricula;

    // metodos
    public Aluno(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
    }
}
class Principal {
    // atributos
    private static Aluno aluno;
    private static Endereco endereco;
    private static Aluno aluno2;
    private static Endereco endereco2;

    // método main
    public static void main(String args[]) {
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        endereco = new Endereco();
        endereco.definirPais("Brasil");
        endereco.definirUF("CE");
        endereco.definirCidade("Fortaleza");
        endereco.definirRua("Avenida da Abolição");
        endereco.definirCEP(60000000);
        endereco.definirComplemento("Bloco B - Ap 13");
        aluno = new Aluno("Zimerman", data, 98765432101, endereco);
        aluno.atualizarIdade();
        idade = aluno.recuperarIdade();

        // inclusão novo aluno
        Calendar data2 = Calendar.getInstance();
        data2.set(1982, 07, 07);
        endereco2 = new Endereco();
        endereco2.definirPais("Brasil");
        endereco2.definirUF("CE");
        endereco2.definirCidade("Fortaleza");
        endereco2.definirRua("rua Canuto de Aguiar");
        endereco2.definirNumero("176");
        endereco2.definirCEP(20252060);
        endereco2.definirComplemento("Ap 307");
        aluno2 = new Aluno("Maria", data, 123456877, endereco);
        aluno2.atualizarIdade();
    }
}
