package dominio;

import dominio.Laboratorio;

public class Predador extends Animal {
    private int id;
    private boolean peconha;
    private boolean status;
    private String lab;

    public Predador(boolean peconha, String cat){
        this.peconha = peconha;
        this.setStatus(true);
        this.setCat(cat);
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
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
