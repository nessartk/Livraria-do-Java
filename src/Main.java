//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // invoca o construtor da classe autor para criar objeto autor 1
        Autor autor1 = new Autor();
        autor1.setNome("Rodrigo Turini");
        autor1.setEmail("rodrigo.turini@Gmail.com");
        autor1.setCpf("123.456.789.10");

        // invoca o construtor da classe Livro para criar o objeto livro1
        Livro livro1 = new Livro(autor1);
        livro1.setNome("Java");
        livro1.setDescricao("Novos recursos da Linguagem");
        livro1.setValor(59.90);
        livro1.setIsbn("978-85-66250-46-6");


        // associa o autor ao seu livro
        livro1.setAutor(autor1);

        // invoca o metodo desconto ( com parametros) para o livro q deseja, no caso :livro  1 somente
        livro1.aplicaDescontoDe(0.4);

        // invoca o metodo para printar os detalhes do objeto 1
        livro1.mostrarDetalhes();


        Autor autor2 = new Autor();
        autor2.setNome("Fafá Turini");
        autor2.setEmail("fafa.turini@Gmail.com");
        autor2.setCpf("010.987.654.32");

        // objeto livro2
        Livro livro2= new Livro(autor2);
        livro2.setNome("Lógica de Programação");
        livro2.setDescricao("Crie seus primeiros programas");
        livro2.setValor(59.90);
        livro2.setIsbn("978-85-66250-22-0");



        // associa o autor ao seu livro
        livro2.setAutor(autor2);

        livro2.aplicaDescontoDe(0.2);


        // invoca o metodo para printar os detalhes do objeto 2
        livro2.mostrarDetalhes();

        Autor autor3= new Autor();
        autor3.setNome("Fifi Turini");
        autor3.setEmail("fifi.turini@teste.com");
        autor3.setCpf("011.897.554.33");


        // objeto livro3
        Livro livro3 = new Livro(autor3);
        livro3.setNome("POO Java");
        livro3.setDescricao("Do Básico ao Avançado");
        livro3.setValor(59.90);
        livro3.setIsbn("978-85-66250-23-0");

        livro3.aplicaDescontoDe(0.0);


        livro3.mostrarDetalhes();

        // ebbok precisa de 1 autor sempre que instanciar um livro ou um ebook, como parametro! new livro, new autor.
        Ebook ebook = new Ebook(new Autor());
        ebook.setNome("Java Ebook");





    }
}