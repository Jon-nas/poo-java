package polimorfismo;

import java.util.Calendar;

import herança.Empregado;

public class Principal {
    // atributos
    private static Empregado empregado, diretor;
    public int maiorElem(int a, int b){
        int maior = a;
        if(b > maior){
            maior = b;
        }
        return maior;
    }
    public int maiorElem(int a, int b, int c){
        int maior = maiorElem(a, b);
        return maiorElem(maior, c);
    }
    public static void main(String args[]){
        Principal objMaior = new Principal();
        int x = 10;
        int y = 25;
        int z = 15;
        System.out.println("O maior numero entre "+ x +" e "+ y +" é: "+objMaior.maiorElem(x, y));
        System.out.println("O maior numero entre "+ x +" e "+ y +" e "+ z +" é: "+objMaior.maiorElem(x, y, z));
    }
    // metodo main
    public static void main(String args[]){
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        empregado = new Empregado("Clara Silva", data, 211456937, null);
        empregado.gerarMatricula();
        diretor = new Diretor("Silbert Oliveira", data, 9015664098,null);
        diretor.gerarMatricula();
        System.out.println("A matrícula do diretor é: "+diretor.recuperarMatricula());
        System.out.println("A matrícula do empregado é: "+empregado.recuperarMatricula());
    }    
}