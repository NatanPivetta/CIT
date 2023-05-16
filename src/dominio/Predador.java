package dominio;

public class Predador extends Animal {
    private int id;
    private boolean peconha;
    private boolean status;

    public Predador(boolean peconha){
        this.peconha = peconha;
        this.setStatus(true);
    }

    public int getId(Predador p){
        return this.id;
    }

    public boolean getPeconha(){
        return peconha;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean veOuF){
        this.status = veOuF;
    }
}
