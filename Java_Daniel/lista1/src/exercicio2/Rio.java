package exercicio2;

public class Rio {
    private String nome;
    private float nivel;
    private boolean poluido;

    Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    Rio() {
        this.nome = "Não informado";
        this.nivel = 0;
        this.poluido = false;
    }
    
    public void chover(float x){
        this.nivel = this.nivel + x;
    }
    public void ensolarar(float x){
        this.nivel = this.nivel - x;
    }
    public void limpar(){
        this.poluido = false;
    }
    public void sujar(){
        this.poluido = true;
    }
    
    public String toString(){
        return "Nome: " + this.nome +
                "\n Nivel: " + this.nivel +
                "\n Poluido " + this.poluido;
    }
    
}

