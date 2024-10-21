public class Fibonacci {
    // atributos
    private static int conta_chamada = 0; // conta o numero de chamadas recursivas

    public double CalcularFibonacci(double num){
        conta_chamada++;
        System.out.println("Chamada recursiva nr: " + conta_chamada);
        if(num != 2 && num != 1)
            return CalcularFibonacci(num - 1) + CalcularFibonacci(num - 2);
        else
            return 1;
    }
}