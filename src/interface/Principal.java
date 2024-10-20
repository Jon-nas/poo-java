public class Principal {
    // atributos
    private static Identificador refIdt;
    private static iPessoa refiPessoa;

    // métodos
    public static void main(String[] args) {
        refIdt = new Pessoa();
        refIdt.atualizarID("M-1020/001");
        System.out.println(refIdt.recuperarID());

        refiPessoa = (Pessoa) refIdt;
        refiPessoa.atualizarNome("Goku");
        System.out.println(refiPessoa.recuperarNome());
    }
}