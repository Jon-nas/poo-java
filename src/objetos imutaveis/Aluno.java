
// exemplo de classe que define objetos imutáveis no código

public final class Aluno {
    //Atributos
    private final String nome;
    private final long CPF;
    private final int matricula;
  
    //Métodos
    protected Aluno ( String nome , long CPF , int matricula ) {
         this.nome = nome;
         this.CPF = CPF;
         this.matricula = matricula;
    }
  
    protected String getNome ( ) {
         return this.nome;
    }    
    protected long getCPF ( ) {
         return this.CPF;
    }
    protected int getMatricula ( ) {
         return this.matricula;
    }    
  }