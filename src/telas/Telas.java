package telas;

import dominio.Laboratorio;
import dominio.Animal;


public class Telas {
    
    public void lab(Laboratorio laboratorio){
        String lab = laboratorio.getNome(laboratorio);
        System.out.println("");
        System.out.println("======== Laboratorio: " + lab + " ========");
        System.out.println("");

    }

    public void alimentando(boolean p){
        
        if (p){
            System.out.println("");
            System.out.println("Alimentando...");
            System.out.println("");
            System.out.println();

        }else{
            System.out.println("");
            System.out.println("Usuário sem permissão! ");
            System.out.println("");
        }
    }

}


