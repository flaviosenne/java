package exercicio1;

public final class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    
    Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    Cliente(){
        this.numeroConta = "000000-0";
        this.numeroAgencia = "0000-0";
        this.nome = "Não informado";
        this.saldo = 0;
    }
    
    // setters
    public void setNumeroConta(String numeroConta){
        if((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')){
           this.numeroConta = numeroConta; 
        }
        else{
            System.out.println("Conta inválida");
        }
    }
    public void setNumeroAgencia(String numeroAgencia){
        if((numeroAgencia.length() == 6) && (numeroAgencia.charAt(4) == '-')){
            this.numeroAgencia = numeroAgencia;
        }
        else{
            System.out.println("Agencia Inválida");
        }
    }
    public void setNome(String nome){
        if(nome.length() <=30){
            this.nome = nome;
        }else{
            System.out.println("Nome inválido");
        };
    }
    public void setSaldo(float x){
        if(x < 0) {
            System.out.println("Saque invalido");
            this.saldo += 0;
        }else{
            this.saldo = x;
        }
    }
    // getters
    public String getNumeroCota(){
        return this.numeroConta;
    }
    public String getnumeroAgencia(){
        return this.numeroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    
    //methods
    public void realizarDeposito(float x){
        this.setSaldo(this.saldo + Math.abs(x));
//        System.out.println("Valor de X"+ x);
    }
    public void realizarSaque(float x){
            this.setSaldo(this.saldo - Math.abs(x));
//        System.out.println("Valor de X"+ x);
    }
    public String toString(){
        return    "----------------------"+
                "\n Numero da Conta: " + this.numeroConta +
                "\n Numero da Agencia: " + this.numeroAgencia +
                "\n Nome: " + this.nome +
                "\n Saldo " + this.saldo+
                "\n ----------------------";
    }
    
}

