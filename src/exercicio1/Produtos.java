package exercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Produtos {
    private double preco;
    private String nomeProduto;
    private List<Produtos> produtos = new ArrayList<>();

    public Produtos(double preco, String nomeProduto) {
        this.preco = preco;
        this.nomeProduto = nomeProduto;
    }

    public Produtos() {
    }

    public double vender(){
        produtos.add(new Produtos(50.00,"Caderno Inteligente"));
        produtos.add(new Produtos(10.00,"Caderno Brochura"));
        produtos.add(new Produtos(15.00,"Caderno Espiral"));

        if (produtos.get(0).preco<produtos.get(1).preco && produtos.get(0).preco<produtos.get(2).preco){
            return produtos.get(0).preco;
        } else if (produtos.get(1).preco<produtos.get(0).preco && produtos.get(1).preco<produtos.get(2).preco) {
            return produtos.get(1).preco;
        }
        else return produtos.get(2).preco;

    }

}
