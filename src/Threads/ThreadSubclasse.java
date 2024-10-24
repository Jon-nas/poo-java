// definindo thread por extensão da classe Threads

public class ThreadSubclasse extends Thread{
    long numero;
    ThreadSubclasse (Long numero){
        this.numero = numero;
    }

    public void run(){
        // implementa o comportamento apropriado.
        ThreadSubclasse novaT = new ThreadSubclasse (200);
        novaT.start ();
    }
}
