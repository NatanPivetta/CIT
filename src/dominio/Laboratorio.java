package dominio;

import java.util.ArrayList;
import java.util.List;
import dominio.*;

public class Laboratorio {
    private String nome;
    private double temperatura;
    List<Animal> animais = new ArrayList<Animal>();

    public Laboratorio(String nome){
        this.nome = nome;
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void addAnimal(Animal a){
        int posicao = 0;
        animais.add(a);
        a.setLab(this);
        if(a instanceof Predador ){
            posicao = animais.size() -1;
            a.setId(posicao);
        }

        
    }

    public List<Animal> getAnimais(){
        return animais;
    }

    public Predador getPredador(int id){
        return (Predador) animais.get(id);
    }

}
