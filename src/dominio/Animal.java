package dominio;

public abstract class Animal {
    private String cat;
    private Laboratorio lab;
    private int id;
    private int quantidade;

    public String getCat(){
        return this.cat;
    }

    public void setCat(String cat){
        this.cat = cat;
    }

    protected void setLab(Laboratorio lab){
            if(lab == null){
                
            }
            this.lab = lab;
    }

    public Laboratorio getLab(){
        return this.lab;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public int getQuant(){
        return this.quantidade;
    }

}
