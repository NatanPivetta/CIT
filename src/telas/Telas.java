package telas;

import dominio.*;
import java.util.Scanner;

public class Telas {
    
    public void lab(Laboratorio laboratorio){
        String lab = laboratorio.getNome();
        System.out.println("");
        System.out.println("======== Laboratorio: " + lab + " ========");
        System.out.println("");

    }


    public void alimentando(boolean msg){
        if(msg){
            System.out.println("Alimentando...");
        }else{
            System.out.println("Sem permissão");
        }
        
    }

    public void registro(Registro reg){
        System.out.println("Data: " + reg.getData());
        System.out.println("Responsável: " + reg.getResponsavel().getNome());
        System.out.println("Predador: " + reg.getPred().getCat() + "[ID: "+ reg.getPred().getId() +"]");
        System.out.println("Presa: "+reg.getQuant()+" "+ reg.getPresa()+"(s)");
    }

    public void telaAliment(){
        System.out.print("ID animal: ");
        Scanner s = new Scanner(System.in);
    }

}


