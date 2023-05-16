package telas;

import dominio.Laboratorio;
import dominio.Animal;
import java.util.Scanner;

public class Telas {
    
    public void lab(Laboratorio laboratorio){
        String lab = laboratorio.getNome(laboratorio);
        System.out.println("");
        System.out.println("======== Laboratorio: " + lab + " ========");
        System.out.println("");

    }


    public void alimentando(String msg){

        System.out.println(msg);
    }

    public void telaAliment(){
        System.out.print("ID animal: ");
        Scanner s = new Scanner(System.in);
    }

}


