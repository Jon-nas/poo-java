abstract class Animal {
    // metodo abstrato
    public abstract void emitirSom();

    // método concreto
    public void dormir(){
        System.out.println("Zzzzz...");
    }
    public void tipoDeAnimal(){
        System.out.println("É um animal selvagem.");
    }
}

// subclasse concreta
class Cachorro extends Animal{
    public void emitirSom(){
        System.out.println("Au, au, au!");
    }
}

// subclasse concreta
class Gato extends Animal{
    public void emitirSom(){
        System.out.println("Miau...");
    }
}

// subclasse abstrata
class Leao extends Animal{
    public void emitirSom(){
        System.out.println("Rooarrr!");
    }
}

public class main{
    public static void main(String[] args){
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal leao = new Leao();

        cachorro.emitirSom();
        cachorro.dormir();

        gato.emitirSom();
        gato.dormir();

        leao.emitirSom();
        leao.dormir();
        leao.tipoDeAnimal();
    }
}