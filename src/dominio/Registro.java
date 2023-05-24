package dominio;
import java.time.LocalDate;
import dominio.*;
import java.util.List;
import java.util.ArrayList;



public class Registro {
    private LocalDate data;
    private int quantidade;
    private Predador predador;
    private Presa presa;
    private Usuario responsavel;

    public Registro(Usuario resp, LocalDate data, Presa presa, Predador predador, int quantidade){
        this.data = data;
        this.presa = presa;
        this.quantidade = quantidade;
        this.predador = predador;
        this.responsavel = resp;

    }

    public LocalDate getData(){
        return this.data;
    }

    public Usuario getResponsavel(){
        return this.responsavel;
    }
    
    public String getPresa(){
        return this.presa.getCat();
    }
    
    public int getQuant(){
        return this.quantidade;
    }
    
    public Predador getPred(){
        return this.predador;
    }

    



}
