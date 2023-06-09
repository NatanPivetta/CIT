package dominio;

import dominio.Laboratorio;

public class Predador extends Animal {
    private int id;
    private boolean peconha;
    private boolean status;
    private String lab;

    public Predador(boolean peconha){
        this.peconha = peconha;
        this.setStatus(true);
    }

    public int getId(){
        return this.id;
    }

    @Override
    public void setId(int id){
        this.id = id;
    }

    public boolean getPeconha(){
        return peconha;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean vivo){
        this.status = vivo;
    }

    
}
