import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

@SuppressWarnings("unused")
public class Empacotador implements Runnable {
    // Atributos
    private final Equipe equipe;
    private final ContadorSinc empacotamentos;
    private final String nome;
    private String lista_threads_id;

    // Construtor
    public Empacotador(int nr_empacotador, Equipe equipe) {
        this.equipe = equipe;
        this.lista_threads_id = new String();
        this.nome = "Emp[" + nr_empacotador + "]@" + equipe.getName();
        empacotamentos = new ContadorSinc(0);
    }

    // Método para listar IDs das threads
    public void listarIdThreads() {
        System.out.println(" |----- Lista de threads executadas por " + nome + " : " + lista_threads_id);
    }

    // Método para listar empacotamentos
    public void listarEmpacotamentos() {
        System.out.println(" |----- Empacotamentos feitos por " + nome + " : " + empacotamentos.getContador());
    }

    @SuppressWarnings("deprecation")
    @Override
    public void run() {
        try {
            // Definindo o nome da thread
            Thread.currentThread().setName(nome);

            // Sincronizando a lista de IDs das threads
            synchronized (lista_threads_id) {
                lista_threads_id = lista_threads_id + "[" + Thread.currentThread().getId() + "]";
            }

            System.out.println(nome + " empacotando (" + System.currentTimeMillis() + ")");
            Thread.sleep((int) (Math.random() * 899 + 100)); // Dorme por um período aleatório entre 100 e 999 ms
            System.out.println(nome + " concluiu  (" + System.currentTimeMillis() + ")");

            // Incrementa o contador de empacotamentos
            empacotamentos.incrementar();
            equipe.liberarFita();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}