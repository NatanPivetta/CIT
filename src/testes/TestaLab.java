package testes;
import dominio.*;
import telas.Telas;
import java.util.List;

public class TestaLab {
    public static void main(String[] args) {
        Telas tela = new Telas();
        Laboratorio lab1, lab2, lab3;
        lab1 = new Laboratorio("Serpentes");
        lab2 = new Laboratorio("Aracno");
        lab3 = new Laboratorio("Camundongos");

        Predador a1, a2, a3;

        a1 = new Predador(false);
        a2 = new Predador(true);
        a3 = new Predador(false);


        a1.setCat("Serpentes");
        a2.setCat("Escorpiões");
        a3.setCat("Serpentes");

        lab1.addAnimal(a1);
        lab1.setTemperatura(25.5);
        lab1.addAnimal(a3);
        lab2.addAnimal(a2);

        System.out.println(a1.getCat()+ ": " + "ID: " + a1.getId());
        System.out.println(a2.getCat()+ ": " + "ID: " + a2.getId());
        System.out.println(a3.getCat()+ ": " + "ID: " + a3.getId());


        List<Animal> lista1 = lab1.getAnimais();
        
        
    }
        
}
