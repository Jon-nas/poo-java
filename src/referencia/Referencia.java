// Uso de referência de objetos em Java
public class Referencia {
    private Aluno a1, a2;
    public Referencia(){
        a1 = new Aluno("Sheldon", 26);
        a2 = new Aluno("Amy", 25);
        System.out.println("O nome do aluno a1 é "+a1.recuperarNome());
        System.out.println("O nome do aluno a2 é "+a2.recuperarNome());
        a2 = a1;
        a2.definirNome("Leonard");
        System.out.println("O nome do aluno a1 é "+a1.recuperarNome());
        manipulaAluno(a1);
        System.out.println("O nome do aluno a1 é "+a1.recuperarNome());
    }
    public void manipulaAluno(Aluno aluno){
        aluno.definirNome("Penny");
    }
    public static void main(String args[]){
        Referencia r = new Referencia();
        System.out.println("Fim da execução.");
    }
}