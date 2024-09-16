public class CarrinhoDeCompras {


    // metodo para add livros - Polimorfismo ( 2 objetos livros diferentes mas sendo Livros)
    // ai basta colocar como referencia a classe pai
    // declara variavel total;

    private double total;

    public void adiciona( Produto produto){
        System.out.println("Adicionando: " + produto);
       // produto.aplicaDescontoDe(0.05);
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }
}
