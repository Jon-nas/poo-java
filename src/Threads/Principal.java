public class Principal {
    // Atributos
    private static PingPong partida;

    // Métodos
    public static void main(String args[]) throws InterruptedException {
        partida = new PingPong(8);
    }
}