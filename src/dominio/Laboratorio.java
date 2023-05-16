package dominio;

import java.util.ArrayList;
import java.util.List;
import dominio.Predador;

public class Laboratorio {
    private String nome;
    private double temperatura;
    List<Object> animais = new ArrayList();

    public Laboratorio(String nome){
        this.nome = nome;
    }

    public void setTemperatura(double temp){
        this.temperatura = temp;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(Laboratorio lab){
        return this.nome;
    }

    public void addAnimal(Animal a){
        animais.add(a);
    }

    public void listaAnimais(){

        for (Object animal : animais) {
            System.out.println(animal);
        }
        
    }
}
