import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExemploMapeamento {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<Integer> quadradoNumeros = map(numeros, x -> x * x);
        System.out.println("Números Originais: " + numeros);
        System.out.println("Números ao Quadrado: " + quadradoNumeros);
    }
    public static <T, R> List<R> map(List<T> lista, Function<T, R> mapa) {
        List<R> resultado = new ArrayList<>();
        for (T item : lista) {
            R itemMapeado = mapa.apply(item);
            resultado.add(itemMapeado);
        }
        return resultado;
    }
}