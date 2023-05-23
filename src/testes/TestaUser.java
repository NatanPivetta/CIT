package testes;
import telas.*;
import dominio.*;
import java.util.List;


public class TestaUser {
    public static void main(String[] args) {
        Telas tela = new Telas();
        Admin adm = new Admin("Natan");
        Estagiario est = new Estagiario();
        Laboratorio lab = new Laboratorio("Serpentes");
        Predador a1;
        Presa p1;
        Registro reg;
        boolean b;

        p1 = new Presa(10);
        a1 = new Predador(true);
        p1.setCat("Rato");
        a1.setCat("Serpente");
        
        b = adm.alimentaAnimal(p1, 2, a1);

        reg = adm.getRegistro(0);
        tela.alimentando(b);
        tela.registro(reg);
        
    }
}
