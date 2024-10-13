import java.util.Calendar;

public class Principal {
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
