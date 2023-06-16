package telas;

import dominio.*;
import testes.Teclado;

import java.io.IOException;
import java.util.Scanner;
import java.util.List;

public class Telas {

    public void menuApp(){
        System.out.println("===========================================");
        System.out.println("==          1 - Acessar Laboratorio      ==");
        System.out.println("==          2 - Adicionar Laboratorio    ==");
        System.out.println("==          3 - Sair                     ==");
        System.out.println("===========================================");

    }

    public void listaLabs(List<Laboratorio> lista){
            System.out.println("===========================================");
        int i=1;

        for(Laboratorio lab: lista){
            System.out.println("==             "+i+" - " +lab.getNome()+ "             ==");
        }

        int op;
        System.out.println("Informe o Laboratório escolhido: ");
        op = Teclado.leInteiro();
        op = op - 1;

    }

    public void acessaLab(int index){
        
    }

    public Laboratorio addLab(){
        Teclado tec = new Teclado();
        System.out.println("Informe um nome para o Laboratorio: ");
        String nome = tec.leString();
        Laboratorio lab = new Laboratorio(nome);
        return lab;
    }
    
    public void lab(Laboratorio laboratorio){
        String lab = laboratorio.getNome();
        System.out.println("");
        System.out.println("======== Laboratorio: " + lab + " ========");
        System.out.println("");
        imprimeListaLab(laboratorio.getAnimais());

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

    public void imprimeListaLab(List<Animal> lista){
        for(Animal p: lista){
            if(p instanceof Predador){
                System.out.println("ID: " + p.getId() + " Categoria: " + p.getCat());
            }if(p instanceof Presa){
            System.out.println(p.getQuant() + " " + p.getCat());
            }
            
        }
    }

    public void imprimeRegistro(Registro reg){
            System.out.println("\nData: " + reg.getData());
        System.out.println("\nPredador: " + reg.getPred().getCat() + " ID: " + reg.getPred().getId());
        System.out.println("\nPresa: " + reg.getQuant() + " " + reg.getPresaCat());
    }

}


