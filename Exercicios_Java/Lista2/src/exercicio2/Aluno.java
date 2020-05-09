
package exercicio2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    private float media;
    
    
    Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    Aluno(){
        this.numeroAluno = 0;
        this.nome = "Não informado";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
    }
    
    // setters
    public void setMedia(float x){
        this.media = x;
    };
    public void setNumeroAluno(int x){
        if(Integer.toString(x).length() == 6){
            this.numeroAluno = x;
        }else{
            System.out.println("Numero inválido");
        }
        
    }
    public void setNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }else{
            System.out.println("Nome muito grande");
        }
        
    }
    public void setIdade(int x){
        if(x <= 0){
            this.idade = 0;
        }else{
            this.idade = x;
        }
    }
    public void setP1(float p1){
        if(p1 < 0){
            this.p1 = 0;
        }else{
            this.p1 = p1;
        }
    }
    public void setP2(float p2){
        if(p2 < 0){
            this.p2 = 0;
        }else{
            this.p2 = p2;
        }
    }
    
    // getters
    public Integer getNumeroAluno(){
        return this.numeroAluno;
    }
    public String getNome(){
        return this.nome;
    }
    public Integer getIdade(){
        return this.idade;
    }
    public Float getP1(){
        return this.p1;
    }
    public Float getP2(){
        return this.p2;
    }
    
    // methods
    public float notaFinal(){
      return this.media = (this.p1 + this.p2)/2;
    }
    public boolean passou(){
        if(this.media >= 6){
            return true;
        }else{
            return false;
        }
    }
    
     public String toString(){
        return    "----------------------"+
                "\n Numero do Aluno: " + this.numeroAluno +
                "\n Nome: " + this.nome +
                "\n Idade: " + this.idade +
                "\n Prova 1: " + this.p1+
                "\n Prova 2: " + this.p2+
                "\n Media: " + this.media +
                "\n Situação: "+ passou()+
                "\n ----------------------";
    }
}
