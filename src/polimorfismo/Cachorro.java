package polimorfismo;

public class Cachorro extends Animal{

    public Cachorro(String nome, double peso, int idade) {
        super(nome, peso, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro emite som: Au, Au!!!");
    }
}
