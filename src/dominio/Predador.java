package dominio;

public class Predador extends Animal {
    private int id;
    private boolean peconha;
    private boolean status;

    public Predador(int id, boolean p, boolean v){
        this.id = id;
        this.peconha = p;
        this.status = v;
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

    public void setStatus(Predador p, boolean veOuF){
        this.status = veOuF;
    }
}
