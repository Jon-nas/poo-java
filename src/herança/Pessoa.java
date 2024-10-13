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
