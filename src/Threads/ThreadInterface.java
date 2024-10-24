// definindo threads por implementação de Runnable.

class ThreadInterface implements Runnable{
    long numero;
    ThreadInterface(Long numero){
        this.numero = numero;
    }

    public void run(){
        // implementa o comportamento apropriado.
        ThreadInterface novaT = new ThreadInterface (200);
        new Thread ( novaT ).start ();
    }
}