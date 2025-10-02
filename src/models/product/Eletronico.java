package models.product;

public class Eletronico {

    private String nome;
    private String marca;
    private Double preco;

    public Eletronico() {}

    public Eletronico(String nome, String marca, Double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do produto: " + this.nome);
    }
}
