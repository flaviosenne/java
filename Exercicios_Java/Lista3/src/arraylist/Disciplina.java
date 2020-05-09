package arraylist;
public class Disciplina {
    private int id;
    private String nome;
    
    public Disciplina(int id, String n){
        this.nome = n;
        this.id = id;
    }
    public Disciplina(){
        this.nome = "Undefined";
        this.id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return "\nID: "+ getId()+
                "\n Nome Disciplina: "+ getNome();
    }
}