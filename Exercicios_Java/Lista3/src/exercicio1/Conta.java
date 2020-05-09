package exercicio1;

public class Conta {
    private String numeroConta, numeroAgencia, nome;
    private float saldo;
    
    public Conta(){
        
    }
    
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSaldo(float x){
        this.saldo = x;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNome() {
        return nome;
    }
    public float getSaldo(){
        return saldo;
    }
    public String toString(){
        return "Numero Conta: " + getNumeroConta()+
            "\n Agencia: " + getNumeroAgencia() +
            "\n Saldo: "+ getSaldo();
    }
}
