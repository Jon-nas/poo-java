public class Principal {
    // Atributo
    @SuppressWarnings("unused")
    private static Empresa ACME;

    // Método principal
    public static void main(String[] args) throws InterruptedException {
        // Inicializa a empresa com os parâmetros: número de fitas, empregados disponíveis,
        // número máximo de equipes, produtos a serem empacotados
        ACME = new Empresa(20, 25, 4, 200);
    }
}