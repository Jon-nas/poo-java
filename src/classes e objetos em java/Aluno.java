/*Classe e sua realização em java*/
public class Aluno {
    private String nome;
    public void inserirNome(String nn){
        nome = nn;
    }
    public String recuperarNome() {
        return nome;
    }
    public static void main(String args[]){
        Aluno a = new Aluno();
        a.inserirNome("Pessoa");
        System.out.println("Saída: "+a.recuperarNome());
    }
}

/*Recursos de declaração de classes em java*/

@Deprecated @SuppressWarnings ("deprecation") public abstract strictfp class Aluno extends Pai
implements Idealizacao, Sonho {
    private String nome;
    public void inserirNome(String nn){
        nome = nn;
    }
    public String recuperarNome(){
        return nome;
    }
}