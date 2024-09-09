public class LivroFisico extends Livro {

    public LivroFisico(Autor autor){
        super(autor);
    }

    // metodo para acrescentar somente em livro fisico uma tx de impressao.
    public double getTaxaImpressao(){
        return this.getValor()*0.05;
    }

}
