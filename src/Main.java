import models.product.Eletronico;
import models.product.Notebook;
import models.product.Smartphone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Eletronico> produtos = new ArrayList<>();

        produtos.add(new Smartphone("Iphone 17", "Apple", 13000.00, "IOS"));
        produtos.add(new Notebook("MacBook Air M2", "Apple", 8500.00, 13.3));

        System.out.println("--- Listando todos os produtos da loja ---\n");

        for (Eletronico produto : produtos) {
            produto.exibirDetalhes();
        }




        sc.close();
    }
}
