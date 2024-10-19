import java.util.Calendar;

public class Pessoa2 {
    // atributos
    protected String nome, naturalidade, nacionalidade, identificador;
    private Calendar data_inicio_existencia;
    private int idade;
    private Endereco endereco;

    // métodos
    public Pessoa2(String nome, Calendar data_inicio_existencia, String identificador, Endereco endereco, String nacionalidade, String naturalidade){
        this.nome = nome;
        this.data_inicio_existencia = data_inicio_existencia;
        this.identificador = identificador;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }
    public String toString(){
        return "Objeto: " + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash: " + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome + "\n\t- Identificador: " + identificador;
    }
}

public class Fisica extends Pessoa2{
    // atributos

    // métodos
    public Fisica(String nome, Calendar data_nascimento, String CPF, Endereco endereco, String nacionalidade, String naturalidae){
        super(nome, data_nascimento, CPF, endereco, nacionalidade, naturalidae);
        atualizarIdade();
    }
}

public class Principal{
    private static Pessoa2 grupo[];
    public static void main(String args[]){
        grupo = new Pessoa2[2];
        grupo [0] = new Fisica("Marco José", data_nasc, "365.586.875-45", null, "Brasil","Rio de Janeiro");
        grupo [1] = new Pessoa2("Escola novo mundo Ltda", data_nasc, "43.186.666/0026-32", null, "Brasil", "Rio de Janeiro");
        for( int i = 0; i <= 1; i++)
            System.out.println("grupo[" + i + "]: " + grupo[i].toString());
    }
}