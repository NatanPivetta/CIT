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

        Predador a1, a2, a3, a4, a5, a6;

        a1 = new Predador(false);
        a2 = new Predador(true);
        a3 = new Predador(false);
        a4 = new Predador(false);
        a5 = new Predador(true);
        a6 = new Predador(false);


        a1.setCat("Serpente");
        a2.setCat("Escorpião");
        a3.setCat("Serpente");
        a4.setCat("Serpente");
        a5.setCat("Serpente");
        a6.setCat("Escorpião");

        lab1.addAnimal(a1);
        lab2.addAnimal(a2);
        lab1.addAnimal(a3);
        lab1.addAnimal(a4);
        lab1.addAnimal(a5);
        lab2.addAnimal(a6);

        System.out.println(a1.getCat()+ ": " + "ID: " + a1.getId());
        System.out.println(a2.getCat()+ ": " + "ID: " + a2.getId());
        System.out.println(a3.getCat()+ ": " + "ID: " + a3.getId());
        System.out.println(a4.getCat()+ ": " + "ID: " + a4.getId());
        System.out.println(a5.getCat()+ ": " + "ID: " + a5.getId());
        System.out.println(a6.getCat()+ ": " + "ID: " + a6.getId());

        tela.lab(lab1);
        tela.lab(lab2);
        tela.lab(lab3);

        
        
    }
        
}
