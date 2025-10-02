package models.product;

public class Smartphone extends Eletronico{
    private String sistemaOperacional;

    public Smartphone(String nome, String marca, Double preco, String sistemaOperacional) {
        super(nome, marca, preco);
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Notebook ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.println("Preco: R$" + getPreco());
        System.out.println("Tamanho da Tela: " + this.sistemaOperacional);
        System.out.println("--------------------------\n");
    }
}
