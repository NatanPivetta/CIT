package testes;
import telas.*;
import dominio.Admin;
import dominio.*;


public class TestaUser {
    public static void main(String[] args) {
        Telas tela = new Telas();
        Admin adm = new Admin();
        Estagiario est = new Estagiario();
        Predador a1;
        a1 = new Predador(20, true, true);
        
        boolean b = adm.alimentaAnimal("Rato", 2, a1);
        tela.alimentando(b);
        
        
    }
}
