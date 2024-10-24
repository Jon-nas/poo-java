import java.util.concurrent.Semaphore;

public class Exemplo{
    Semaphore sem = new Semaphore(50, true); // define até 50 acessos e o uso de FIFO.
    sem.acquire(); // solicita 1 acesso
    // região crítica
    sem.release(); // libera o acesso obitido
    // codigo não crítico
    sem.acquire(4); // solicita 4 acessos
    // região crítica
    sem.release(4); // libera os 4 acessos obitidos
    // código não critico
}






...
private Exemplo ex = new Exemplo (); //”ex” é uma referência para objetos do tipo “Exemplo” (classe)
...
//Método sincronizado
public synchronized void decrementa ( ) {
  conta--;
}
...
public void impressao () {
//Região de código sincronizada
  synchronized (ex) {
   ex.imprime (); //invoca o método “imprime ()” do objeto “ex” de maneira sincronizada
  }
}
...