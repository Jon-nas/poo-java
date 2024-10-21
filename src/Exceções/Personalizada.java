public class Personalizada {
    public static void main(String[] args) {
        try {
            int resultado = divisao(20, 0);
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoPersonalizadaPorZero e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static int divisao(int dividendo, int divisor)
            throws DivisaoPersonalizadaPorZero {
        if (divisor == 0) {
            throw new DivisaoPersonalizadaPorZero("O divisor não pode ser zero.");
        }
        return dividendo / divisor;
    }
}

class DivisaoPersonalizadaPorZero extends Exception {
    public DivisaoPersonalizadaPorZero(String mensagem) {
        super(mensagem);
    }
}