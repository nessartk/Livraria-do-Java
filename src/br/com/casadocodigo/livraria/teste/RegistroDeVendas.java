package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.*;

public class RegistroDeVendas {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Vanessa Rutkoski");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Aprendendo a programar");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Aprendendo a programar");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total: " + carrinho.getTotal());

        Produto[] produtos = carrinho.getProdutos();
        for (int i = 0; i <= produtos.length; i++) {
            try {
                Produto produto = produtos[i];
                if (produto != null) {
                    System.out.println(produto.getValor());
                }
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Deu exception no indice : " + i);
            }catch (NullPointerException e){
                System.out.println("A array não foi instanciada!");
            }
            }

        }


    }

// o metodo executado sempre será escolhido em tempo de execucao( runtime) e nao em compilacao