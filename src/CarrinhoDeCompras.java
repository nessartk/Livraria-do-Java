public class CarrinhoDeCompras {


    // metodo para add livros - Polimorfismo ( 2 objetos livros diferentes mas sendo Livros)
    // ai basta colocar como referencia a classe pai
    // declara variavel total;

    private double total;

    public void adiciona( Livro livro){
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.05);
        total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }
}
