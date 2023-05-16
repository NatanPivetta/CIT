package dominio;

public class Presa extends Animal {
    private int quantidade;
    
    public Presa(int q){
        this.quantidade = q;
    }

    public void reproduzir(Presa p, int q){
        this.quantidade += q;
    }

    public int getQuant(Presa p){
        return this.quantidade;
    }

}
