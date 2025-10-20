package polimorfismo;

import java.util.Scanner;

public class MainPet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("= = = Preencha os dados do seu pet = = =");
        System.out.println("O que o seu bixinho é? (cachorro, gato, outros...)");
        String tipoAnimal = sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        System.out.print("Idade:");
        int idade = sc.nextInt();

        Animal pet;

        if (tipoAnimal.equalsIgnoreCase("cachorro")) {
            pet = new Cachorro(nome, peso, idade);
        } else if (tipoAnimal.equalsIgnoreCase("gato")) {
            pet = new Gato(nome, peso, idade);
        } else {
            pet = new Animal(nome, peso, idade);
        }

        pet.emitirSom();

        sc.close();
    }
}
