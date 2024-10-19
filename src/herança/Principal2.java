import java.util.Calendar;

public class Principal2 {
    // atributos
    private static int I1, I2, I3;
    private static String S1, S2, S3;
    private static Fisica p1, p2;
    private static Pessoa p3;

    // metodos
    public int hashCode(){
        if (this instanceof Pessoa) {
            return this.nome.hashCode();
        } else {
            return super.hashCode();
        }
    }
    public static void main(String args[]) {
        I1 = 1;
        I2 = 2;
        I3 = 1;
        S1 = "a";
        S2 = "b";
        S3 = "a";
        Calendar data_nasc = Calendar.getInstance();
        data_nasc.set(1980, 10, 23);
        p1 = new Fisica("Marco Jose", data_nasc, "365.586.875-45", null, "Brasil", "Rio de Janeiro");
        p2 = new Fisica("Marco Aurelio", data_nasc, "365.586.875-45", null, "Brasil", "Rio de Janeiro");
        p3 = new Pessoa("Classe Pessoa", null, null, null, "Brasil", "Rio de Janeiro");
        compararEquals(p1, p2, p3);
        compararEquals(I1, I2, I3);
        compararEquals(S1, S2, S3);
    }

    public boolean equals(Object obj) {
        if ((nome.equals(((Pessoa) obj).nome)) && (this instanceof Pessoa)) {
            return true;
        } else {
            return false;
        }
    }

    public static void compararEquals(Object o1, Object o2, Object o3) {
        System.out.println("Uso de EQUALS para comparar " + o1.getClass().getName());
        if (o1.equals(o2)) {
            System.out.println("o1 == o2");
        } else {
            System.out.println("o1 != o2");
        }
        if (o1.equals(o3)) {
            System.out.println("01 == 03");
        } else {
            System.out.println("o1 != o3");
        }
    }
}