package dominio;

public class Presa extends Animal {
    private int quantidade;

    public Presa(int q, String cat){
        this.quantidade = q;
        this.setCat(cat);
    }
    
    public Presa(int q){
        this.quantidade = q;
    }

    public void reproduzir(int q){
        this.quantidade += q;
    }

    @Override
    public int getQuant(){
        return this.quantidade;
    }

    public void setQuant(int q){
        this.quantidade = q;
    }

    public void reduzir(int q){
        this.quantidade = quantidade - q;
    }

}
