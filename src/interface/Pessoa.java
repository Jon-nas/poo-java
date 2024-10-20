import java.util.Calendar;

public class Pessoa implements iPessoa, Identificador {
    // atributos
    int idade;
    String nome = "", naturalidade = "", nacionalidade = "", identificador = "";

    // métodos
    @Override
    public void atualizarNome(String nome) {
        if (!nome.isBlank())
            this.nome = nome;
        else
            System.out.println("ERRO: nome em branco!");
    }

    @Override
    public String recuperarNome() {
        return this.nome;
    }

    @Override
    public void atualizarID(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String recuperarID() {
        return this.identificador;
    }

    @Override
    public void formatarID(int id) {
        this.identificador = String.valueOf(id);
    }

    @Override
    public void validarID(String id) {
        if (id.isBlank() || id.isEmpty())
            System.out.println("ERRO: ID inválido!");
        else
            System.out.println("ID válido!");
    }

    @Override
    public String recuperarNacionalidade() {
        return this.nacionalidade;
    }

    @Override
    public String recuperarNaturalidade() {
        return this.naturalidade;
    }

    @Override
    public void atualizarIdade(Calendar data_inicio_existencia) {
        this.idade = calcularIdade(data_inicio_existencia);
    }

    @Override
    public int recuperarIdade() {
        return this.idade;
    }

    @Override
    public int retornaTipo() {
        return 0;
    }

    @Override
    public int calcularIdade(Calendar data_inicio_existencia) {
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(Calendar.YEAR) - data_inicio_existencia.get(Calendar.YEAR);
        if ((data_inicio_existencia.get(Calendar.MONTH) > hoje.get(Calendar.MONTH))
                || (data_inicio_existencia.get(Calendar.MONTH) == hoje.get(Calendar.MONTH)
                        && data_inicio_existencia.get(Calendar.DAY_OF_MONTH) > hoje.get(Calendar.DAY_OF_MONTH)))
            lapso--;
        return lapso;
    }
}