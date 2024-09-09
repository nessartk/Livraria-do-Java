public class Ebook extends Livro{
    private String waterMark;

    public Ebook (Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15){
            return false;
        }
        double desconto = (this.getValor() - this.getValor()* porcentagem);
        setValor(desconto);
        return true;
    }

    public void setWaterMark(String waterMark){
        this.waterMark = waterMark;
    }
    public String getWaterMark(){
        return waterMark;
    }



}
