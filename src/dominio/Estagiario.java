package dominio;

public class Estagiario extends Usuario {
    
    @Override
    public boolean temPermissao() {
        return false;
    }
    
}
