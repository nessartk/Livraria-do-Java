package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras {


    // metodo para add livros - Polimorfismo ( 2 objetos livros diferentes mas sendo Livros)
    // ai basta colocar como referencia a classe pai
    // declara variavel total;

    private double total;
    private Produto[] produtos= new Produto[10];
    private int contador =0;



    public void adiciona( Produto produto){
        System.out.println("Adicionando: " + produto);
       this.produtos[contador]= produto;
       contador++;
       this.total += produto.getValor();
    }


    public double getTotal() {
        return total;
    }


    public Produto[] getProdutos() {
        return new Produto[10];
    }
}
