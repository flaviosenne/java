package exercicio1;

public class Cartao {
    private String numero;
    private int cvv;
    private String validade;
    private String senha;
    
   // associação co Conta
    private Conta conta;
    
    public Cartao(){
        
    }

    public String getNumero() {
        return numero;
    }

    public int getCvv() {
        return cvv;
    }

    public String getValidade() {
        return validade;
    }

    public String getSenha() {
        return senha;
    }

    public Conta getConta() {
        return conta;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
//    public boolean comprar(float valor, String senha){
//        if(senha.equals(this.senha)){
//            if(this.conta.getSaldo()>= valor){
//                this.conta.setSaldo(this.conta.getSaldo() - valor);
//            }else{
//                return false;
//            }
//        }else{
//            return false;
//        }
//    }
    @Override
    public String toString(){
        return "Cartão: " + getNumero()+
            "\n"+conta.toString()+
            "\n CVV: " + getCvv() +
            "\n Validade: "+ getValidade()+
            "\n Saldo: "+ getSenha();
        
    }
}
