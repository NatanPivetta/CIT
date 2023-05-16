package dominio;

public class Presa extends Animal {
    private int quantidade;
    
    public Presa(int q){
        this.quantidade = q;
    }

    public void reproduzir(int q){
        this.quantidade += q;
    }

    public int getQuant(){
        return this.quantidade;
    }

}
