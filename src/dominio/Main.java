package dominio;

import telas.*;
import testes.Teclado;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<Laboratorio> labs = new ArrayList<Laboratorio>();
        Telas tela = new Telas();
        Teclado teclado = new Teclado();
        int op;
        do {
            System.out.flush();
            tela.menuApp();
            op = teclado.leInteiro();

            switch (op) {
                case 1:
                    System.out.flush();
                    if (labs.isEmpty()) {
                        System.out.println("Lista de Laboratórios está vazia!");
                    } else {
                        tela.listaLabs(labs);
                    }
                    break;
                case 2:
                    Laboratorio lab = tela.addLab();
                    labs.add(lab);
                    break;
            }
        } while (op != 3);

    }

}
