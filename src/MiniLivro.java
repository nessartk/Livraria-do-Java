public class MiniLivro extends Livro {


    public MiniLivro(Autor autor) {
        super(autor);
    }

    // metodo q define a regra de desconto pq a classe pai tem metodo abstrato agora, para poder compilar
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }
}

