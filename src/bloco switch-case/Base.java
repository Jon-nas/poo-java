public class Base {
    private String linguagem = "JAVA";
    public void desvio(){
        switch (linguagem) {
            case ( "C" ):
                System.out.println("Suporta apenas programação estruturada.");
                break;

            case ( "C++" ):
                System.out.println("Suporta programaão estruturada e orientada a objeto.");
                break;

            case ( "JAVA" ):
                System.out.println("Suporta apenas programaão orientada a objeto.");
                break;
        
            default:
                System.out.println("Erro!");
                break;
        }
    }
}
class Base {
    public static void main (String args []) {
        private int controle = 0;
        while ( controle < 10 ) {
            System.out.println(controle);
            controle++;
        }
    }
}