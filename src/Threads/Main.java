import java.util.concurrent.Semaphore;

class Shared {
    static int count = 0;
}

class ProdutorConsumidor extends Thread {
    final boolean produtor;
    final Semaphore s;

    public ProdutorConsumidor(Semaphore s, boolean produtor) {
        this.produtor = produtor;
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                s.acquire();
                Shared.count += (produtor) ? 1 : -1;
                System.out.println(Shared.count);
                s.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(1);
        Thread t1 = new ProdutorConsumidor(s, true);
        Thread t2 = new ProdutorConsumidor(s, false);
        t1.start();
        t2.start();
    }
}

