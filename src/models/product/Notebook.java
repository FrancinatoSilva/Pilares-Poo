package models.product;

import java.sql.SQLOutput;

public class Notebook extends Eletronico{
    private double tamanhoTela;

    public Notebook(String nome, String marca, Double preco, double tamanhoTela) {
        super(nome, marca, preco);
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Smartphone ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.println("Preco: R$" + getPreco());
        System.out.println("Tamanho da Tela: " + this.tamanhoTela + "polegadas");
        System.out.println("--------------------------\n");
    }
}
