import java.util.Calendar;

public interface Identificador {
    int tamanho_max = 21;

    void validarID(String id);

    void formatarID(int tipo);

    void atualizarID(String id);

    String recuperarID();
}