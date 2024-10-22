public class Calculadora {
    public int divisao(int dividendo, int divisor) throws ArithmeticException {

        if (divisor == 0)
            throw new ArithmeticException("Divisor nulo.");
        return dividendo / divisor;
    }
}