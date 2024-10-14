import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno {
    // atributos
    private String matricula, nome, naturalidade;

    // métodos
    public Aluno(String nome, String naturalidade) {
        this.nome = nome;
        this.naturalidade = naturalidade;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", nome, naturalidade);
    }
}

class Escola {
    // atributos
    private String nome, CNPJ;
    private Endereco endereco;
    private List departamentos;
    private List discentes;

    // métodos
    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<Departamento>();
        this.discentes = new ArrayList<Aluno>();
    }

    public void criarDepartamento(String nomeDepartamento) {
        departamentos.add(new Departamento(nomeDepartamento));
    }

    public void fecharDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public void matricularAluno(Aluno novoAluno) {
        discentes.add(novoAluno);
    }

    public void trancarMatriculaAluno(Aluno aluno) {
        discentes.remove(aluno);
    }

    public void agruparAlunos() {
        Map<String, List<Aluno>> agrupamento = new HashMap<>();
        for (Aluno a : discentes) {
            if (!agrupamento.containsKey(a.recuperarNaturalidade())) {
                agrupamento.put(a.recuperarNaturalidade(), new ArrayList<>());
            }
            agrupamento.get(a.recuperarNaturalidade()).add(a);
        }
        System.out.println("Resultado do agrupamento por naturalidade: " + agrupamento);
    }
}

public class Principal {
    // atributos
    private static Aluno aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9;
    private static Escola escola;

    // método main
    public static void main(String args[]) {
        escola = new Escola("Escola Pedro Alvares Cabral", "42.336.174/0006-13");
        criarAlunos();
        matricularAlunos();
        escola.agruparAlunos();
    }

    // métodos
    private static void criarAlunos() {
        aluno1 = new Aluno("Marco Cardoso", "Rio de Janeiro");
        aluno2 = new Aluno("Clara Silva", "Rio de Janeiro");
        aluno3 = new Aluno("Marcos Cintra", "Sorocaba");
        aluno4 = new Aluno("Ana Beatriz", "Barra do Pirai");
        aluno5 = new Aluno("Marcio Gomes", "São Paulo");
        aluno6 = new Aluno("Gilmar Carlos", "Sorocaba");
        aluno7 = new Aluno("César Augusto", "São Paulo");
        aluno8 = new Aluno("Alejandra Gomez", "Madri");
        aluno9 = new Aluno("Castelo Branco", "São Paulo");
    }

    private static void matricularAlunos() {
        escola.matricularAluno(aluno1);
        escola.matricularAluno(aluno2);
        escola.matricularAluno(aluno3);
        escola.matricularAluno(aluno4);
        escola.matricularAluno(aluno5);
        escola.matricularAluno(aluno6);
        escola.matricularAluno(aluno7);
        escola.matricularAluno(aluno8);
        escola.matricularAluno(aluno9);
    }
}