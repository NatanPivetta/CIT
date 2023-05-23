package dominio;

public abstract class Animal {
    private String cat;
    private Laboratorio lab;
    private int id;

    public String getCat(){
        return this.cat;
    }

    public void setCat(String cat){
        this.cat = cat;
    }

    protected void setLab(Laboratorio lab){
            this.lab = lab;
    }

    public Laboratorio getLab(){
        return this.lab;
    }

    public void setId(int id){
        this.id = id;
    }

}
