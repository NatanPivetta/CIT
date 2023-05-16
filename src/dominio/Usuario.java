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

    public boolean alimentaAnimal(String alimento, int q, Predador predador ){
        LocalDate c = LocalDate.now();
        boolean vivo = predador.getStatus();
        boolean peconha = predador.getPeconha();
        boolean permissao = this.temPermissao();
        boolean efetivado = false;
        if (vivo){
            if(peconha){
                if (permissao){
                    efetivado = true;
                    Registro r = new Registro(c, alimento, predador, q);
                }
                
            }
            
        }


        return efetivado;
    }

    

}
