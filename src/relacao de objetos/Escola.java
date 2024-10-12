//exemplo de relações de agregação e composição entre objetos.
public class Escola {
    //atributos
    private String nome, CNPJ;
    private Endereco endereco;
    private Departamento departamentos [];
    private Aluno discentes [];
    private int nr_discentes, nr_departamentos;
    //metodos
    public Escola(String nome, String CNPJ){
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new Departamento[10];
        this.discentes = new Aluno[1000];
        this.nr_departamentos = 0;
        this.nr_discentes = 0;
    }
    public void criarDepartamento(String nomeDepartamento){
        if(nr_departamentos <= 10)
        {
            departamentos[nr_departamentos] = new Departamento(nomeDepartamento);
            nr_departamentos++;
        } else {
            System.out.println("Não e possivel criar outro departamento.");
        }
    }
    public void matricularAluno(Aluno novAluno){
        discentes [nr_discentes] = novAluno;
    }
}
