package br.com.casadocodigo.livraria.produtos;

import java.util.ArrayList;

public class CarrinhoDeCompras {


    // metodo para add livros - Polimorfismo ( 2 objetos livros diferentes mas sendo Livros)
    // ai basta colocar como referencia a classe pai
    // declara variavel total;

    private double total;
    private ArrayList<Produto>produtos;

    public CarrinhoDeCompras(){
        this.produtos = new ArrayList<>();
    }


    public void adiciona( Produto produto){
        this.produtos.add(produto);
    }

    public void remove (int posicao){
        this.produtos.remove(posicao);
    }


    public double getTotal() {
        return total;
    }


    public ArrayList<Produto> getProdutos(){
        return produtos;
    }
}
