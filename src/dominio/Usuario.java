package dominio;
import java.util.Calendar;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;



import dominio.*;
import telas.*;

public abstract class Usuario {
    protected String login;
    protected String senha;
    protected String email;
    protected String nome;
    private List<Registro> registros = new ArrayList<Registro>();

    public abstract boolean temPermissao();



    public boolean alimentaAnimal(Presa alimento, int q, Predador predador ){
        LocalDate calendar = LocalDate.now();
        boolean vivo = predador.getStatus();
        boolean peconha = predador.getPeconha();
        boolean permissao = this.temPermissao();
        boolean msg = false;
        

        if (!vivo){
            msg = false;
            // Animal não está vivo, tratar erro
            throw new RuntimeException("Animal não está vivo");

        }else{
            if(peconha){
                if(permissao){
                    msg = true;
                    alimento.reduzir(q);
                    Registro reg = new Registro(this, calendar, alimento, predador, q);
                    addReg(reg);
                }else{
                    msg = false;
                    throw new RuntimeException("Usuário sem Permissão");
                }
            }else{
                msg = true;
                alimento.reduzir(q);
                Registro reg = new Registro(this, calendar, alimento, predador, q);
                addReg(reg);

            }
        }
        return msg;
    }


    public void addReg(Registro reg){
        registros.add(reg);
    }

    public Registro getRegistro(int id){
        return registros.get(id);
    }
    
    public String getNome(){
        return this.nome;
    }

}
