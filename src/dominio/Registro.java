package dominio;
import java.time.LocalDate;

public class Registro {
    private LocalDate data;
    private int quantidade;
    private Predador predador;
    private String presa;

    public Registro(LocalDate data, String presa, Predador predador, int quantidade){
        this.data = data;
        this.presa = presa;
        this.quantidade = quantidade;
        this.predador = predador;

    }

    public LocalDate getData(){
        return this.data;
    }

}
