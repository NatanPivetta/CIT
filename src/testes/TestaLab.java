package testes;
import dominio.Laboratorio;
import dominio.Animal;
import dominio.Predador;
import dominio.Presa;
import telas.Telas;

public class TestaLab {
    public static void main(String[] args) {
        Telas tela = new Telas();
        Laboratorio lab1, lab2, lab3;
        lab1 = new Laboratorio("Cobras");
        lab3 = new Laboratorio("Aracno");
        Predador a1, a2;

        a1 = new Predador(15, true, true);
        a1.setCat("Cobra");
        a2 = new Predador(10, false, true);
        a2.setCat("Escorpião");
        lab1.addAnimal(a1);
        lab3.addAnimal(a2);
        

        
        lab2 = new Laboratorio("Camundongos");
        Presa p1 = new Presa(10);
        p1.setCat("Rato");
        p1.reproduzir(p1, 4);
        p1.reproduzir(p1, 5);
        
        
        tela.lab(lab1);
        lab1.listaAnimais();


        tela.lab(lab3);
        lab3.listaAnimais();
    }
        
}
