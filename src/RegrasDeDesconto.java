public class RegrasDeDesconto {
    public static void main(String []args){

          Autor autor = new Autor();
          autor.setNome(" Rodrigo Turini");

          Livro livro = new Livro(autor);
          livro.setValor(59.90);

//        System.out.println("Valor atual: "+ livro.getValor());
//
         if (!livro.aplicaDescontoDe(0.3)){ // logica aplicada como true acima dos 30%
            System.out.println("O desconto não pode ser maior do que 30%"); // se ativar a classe, comentar no metodo aplicaDesconto
         }else{
            System.out.println("Valor do Livro com desconto: "+ livro.getValor());
        }

         Ebook ebook = new Ebook(autor);
         ebook.setValor(29.90);

         if(!ebook.aplicaDescontoDe(0.15)){
             System.out.println("O desconto não pode ser maior do que 15% ");
         }else{
             System.out.println("Valor do Ebbok com desconto: "+ ebook.getValor());
         }

    }
}
