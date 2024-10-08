package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Produto {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;


    // construtor para autor obriga a passagem de um autor como parametro;
    // exception caso o autor for nulo
    public Livro(Autor autor) {
        if (autor == null) {
            throw new RuntimeException("O autor do livro não pode ser nulo");

        } this.autor = autor;
    }

    // métodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }




    // método para exibir os atributos do livro no console
    public void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do br.com.casadocodigo.livraria.produtos.Livro";
        System.out.println(mensagem);
        System.out.println("Nome do livro: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if ( this.temAutor()){ // se autor for diferente de null, imprimir junto aos detalhes do livro
            autor.mostrarDetalhes();
        }
        System.out.println("---");

    }

    // metodo para desconto em%

    //   public abstract boolean aplicaDescontoDe(double porcentagem); -- substituida pela interface promocional
//        if (porcentagem > 0.3){
//            System.out.println("O Desconto não pode ser maior que 30%"); // msg printa em console, se quiser hide, comentar apenas
//            return false;
//
//        }else {
//            this.valor -= this.valor * porcentagem;
//            return true;







    // metodo para  saber se o livro tem autor
    boolean temAutor(){
        return this.autor != null;


    }


    public abstract boolean aplicaDescontoDe(double v);
}
