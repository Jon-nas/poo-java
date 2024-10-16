import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> lst_numeros = new ArrayList<>();

        // inserção dos elementos no ArrayList
        lst_numeros.add(10);
        lst_numeros.add(20);
        lst_numeros.add(30);
        lst_numeros.add(40);
        lst_numeros.add(50);

        // acesso aos elementos no ArrayList
        System.out.println("Os elementos no ArrayList são: ");
        for(int i = 0; i < lst_numeros.size(); i++){
            System.out.println("lista["+ 1 +"] = "+lst_numeros.get(i));
        }

        // remover o elemento de uma posição especifica do ArrayList
        lst_numeros.remove(1); // remove p elemento da posição 2 do ArrayList

        // alterar um elemento no ArrayList
        int x = 57;
        lst_numeros.set(0, x); // coloca o elemento 57 na posição 0 de ArrayList

        // verificar se o ArrayList contém um elemento específico
        int n = 100;
        String contem_elemento = lst_numeros.contains(n)?"Verdadeiro": "Falso";
        System.out.println("O elemento "+ n +" esta no ArrayList? "+contem_elemento);

        // itera na lista através do laço for-each
        int k = 0;
        System.out.println("Os elementos no ArrayList são: ");
        for (int elemento : lst_numeros) {
            System.out.println("lista["+k+"] = "+elemento);
            k++;
        }

        // limpar o ArrayList de todos os elementos
        System.out.println("Limpar o ArrayList.");
        lst_numeros.clear();

        // verificar se o ArrayList está vazio
        String eh_vazio = lst_numeros.isEmpty()? "Verdadeiro": "Falso";
        System.out.println("O ArrayList esta vazio? "+ eh_vazio);
    }
}
