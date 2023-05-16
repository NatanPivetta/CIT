package dominio;
import dominio.Predador;

public class Admin extends Usuario{
    
    @Override
    public boolean temPermissao() {
        return true;
    }
    
    public void cadastraAnimal(Laboratorio lab, Predador p){
        lab.addAnimal(p);
    }

    public void cadastraEstagiario(){
        Estagiario e = new Estagiario();

    }

    public void registraObito(Predador p){
        p.setStatus(false);
    }    

}
