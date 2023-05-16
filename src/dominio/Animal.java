package dominio;

public abstract class Animal {
    private String cat;

    public String getCat(Animal animal){
        return this.cat;
    }

    public void setCat(String cat){
        this.cat = cat;
    }

}
