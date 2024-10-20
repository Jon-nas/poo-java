import java.util.Calendar;

public interface iPessoa {
    void atualizarNome(String nome);

    String recuperarNome();

    String recuperarNacionalidade();

    String recuperarNaturalidade();

    void atualizarIdade(Calendar data_inicio_existencia);

    int recuperarIdade();

    int retornaTipo();

    int calcularIdade(Calendar data_inicio_existencia);
}