public class LivroFisico extends Livro {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    // metodo para acrescentar somente em livro fisico uma tx de impressao.
    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;

        }
        double desconto = getValor() * porcentagem;
        setValor((getValor()- desconto));
        System.out.println("Aplicando desconto no LivroFísico");
            return true;

        }
    }
}
