import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int dividendo, divisor;
        String controle = "s";

        Calculadora calc = new Calculadora();
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Entre com o dividendo: ");
            dividendo = s.nextInt();
            System.out.println("Entre com o divisor: ");
            divisor = s.nextInt();
            try {
                System.out.println("O quociente é: " + calc.divisao(dividendo, divisor));
            } catch (ArithmeticException e) {
                System.out.println("ERRO: Divisão por zero! " + e.getMessage());
            }
            System.out.println("Repetir?");
            controle = s.next();
        } while (controle.equals("n"));
        s.close();
    }
}