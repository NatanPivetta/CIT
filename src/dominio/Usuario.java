package dominio;
import java.util.Calendar;
import java.time.LocalDate;

import dominio.*;
import telas.*;
import dominio.Predador;
public abstract class Usuario {
    private String login;
    private String senha;
    private String email;
    private String nome;

    public abstract boolean temPermissao();



    public String alimentaAnimal(String alimento, int q, Predador predador ){
        LocalDate calendar = LocalDate.now();
        boolean vivo = predador.getStatus();
        boolean peconha = predador.getPeconha();
        boolean permissao = this.temPermissao();
        String msg = "";
        if (vivo){
            
            if (peconha && permissao){
                msg = "Alimentando...";
                Registro r = new Registro(calendar, alimento, predador, q);
            }else{
                msg = "Sem permissão!";
            }
                
            
            
        }else{
            msg = "Animal não está vivo!";
        }


        return msg;
    }

    

}
