import java.util.Calendar;

public class Principal3 {
    // atributos
    private static Pessoa p1, p3;
    private static Fisica p2;

    // métodos
    public static void main(String args[]){
        Calendar data_nasc = Calendar.getInstance();
        data_nasc.set(1980, 10, 23);
        p1 = new Fisica("Sheldon", data_nasc, "365.586.875-45", null, "USA", "Passadina");
        p2 = new Fisica("Leonard", data_nasc, "365.586.875-45", null, "USA", "Passadina");
        p3 = new Pessoa("Classe Pessoa", null, null, null, "USA", "Passadina");
        if(p1 instanceof Pessoa){
        System.out.println("p1 é instância do tipo pessoa.");
        } else{
        System.out.println("p1 não e instância do tipo pessoa.");
        }

        if (p2 instanceof Pessoa)
        System.out.println("p2 é instância do tipo pessoa.");
        else
        System.out.println("p2 não e instância do tipo pessoa.");

        if (p3 instanceof Pessoa)
            System.out.println("p3 e instância do tipo pessoa.");
        else
            System.out.println("p3 não é instância do tipo pessoa.");

        if (p3 instanceof Fisica)
            System.out.println("p3 é instância do tipo fisica.");
        else
            System.out.println("p3 não é instância do tipo fisica.");
    }
}
