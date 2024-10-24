import java.util.concurrent.Semaphore;

class Controle {
    private int controle;

    public Controle(int controle) {
        this.controle = controle;
    }

    public int getControle() {
        return controle;
    }

    public void decrementa() {
        controle--;
    }
}

class PingPong {
    // atributos
    private Semaphore s1, s2;
    private Ping ping;
    private Pong pong;
    private Controle contador;
    private int tamanho_paratida;

    // métodos
    public PingPong(int tamanho_paratida) throws InterruptedException {
        s1 = new Semaphore(0);
        s2 = new Semaphore(0);
        contador = new Controle(tamanho_paratida);
        ping = new Ping(s1, s2, contador);
        pong = new Pong(s1, s2, contador);
        // juiz = new Juiz(tamanho_paratida / 2);
        new Thread(ping).start();
        new Thread(pong).start();
        s1.release();
    }
}

class Ping implements Runnable {
    // atributos
    private Semaphore s1, s2;
    private Controle contador;

    // metodos
    public Ping(Semaphore s1, Semaphore s2, Controle contador) {
        this.s1 = s1;
        this.s2 = s2;
        this.contador = contador;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread A (PING) iniciada.");
            while (contador.getControle() > 0) {
                s1.acquire();
                System.out.println("PING => 0");
                s2.release();
                contador.decrementa();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread A (PING) terminada.");
    }
}

class Pong implements Runnable {
    // Atributos
    private Semaphore s1, s2;
    private Controle contador;

    // Métodos
    public Pong(Semaphore s1, Semaphore s2, Controle contador) {
        this.s1 = s1;
        this.s2 = s2;
        this.contador = contador;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread B (PONG) iniciada");
            while (contador.getControle() > 0) {
                s2.acquire();
                System.out.println("0 <= PONG");
                s1.release();
                contador.decrementa();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread B (PONG) terminada.");
    }
}

public class Principal {
    // Atributos
    private static PingPong partida;

    // Métodos
    public static void main(String[] args) throws InterruptedException {
        partida = new PingPong(8);
    }
}