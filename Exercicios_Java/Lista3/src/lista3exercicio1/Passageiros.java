
package lista3exercicio1;

public class Passageiros {
    private String nome;
    private String cpf;
    
    
    public Passageiros(String n, String c){
        this.nome = n;
        this.cpf = c;
    }
    public Passageiros(){
        this.nome = "Indefinido";
        this.cpf = "indefinido";
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String toString(){
        return "Nome Passageiro: "+ getNome()+
             "\nCPF: "+ getCpf();
    }
}
