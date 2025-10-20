package polimorfismo;

public class Gato extends Animal{

    public Gato(String nome, double peso, int idade) {
        super(nome, peso, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Gato emite som: MIAU!!!");
    }
}
