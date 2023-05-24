package dominio;

public class Id {
    public static int id = 0;
    
    public static int getId() {
        Id.id += 1;
        return Id.id - 1;

    }

    public static void setId(){

    }

    

    
    
}
