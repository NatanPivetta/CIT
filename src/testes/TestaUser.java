package testes;
import telas.*;
import dominio.*;
import java.util.List;


public class TestaUser {
    public static void main(String[] args) {
        Telas tela = new Telas();
        Admin adm = new Admin("Natan");
        Estagiario est = new Estagiario();
        Laboratorio lab1, lab2, lab3, lab4;
        boolean b;
        lab1 = new Laboratorio("Serpentes");
        lab2 = new Laboratorio("Aracno");
        lab3 = new Laboratorio("Presas");
        

        Predador a1, a2, a3, a4, a5, a6;
        Presa p1, p2;
        p1 = new Presa(10, "Ratos");
        p2 = new Presa(1000, "Baratas");

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

        lab3.addAnimal(p1);
        lab3.addAnimal(p2);
        
        tela.lab(lab1);
        

        tela.lab(lab2);
        

        tela.lab(lab3);
        
        b = adm.alimentaAnimal(p2, 2, a6);
        tela.alimentando(b);
        tela.lab(lab3);
        tela.imprimeRegistro(adm.getRegistro(0));
    }
}
