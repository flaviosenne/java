package heranca;
public class Gerente extends Funcionario{
    private float comissao;
    
    public Gerente(){
        super(); //chama construtor do funcionario
    }
    public Gerente(float salario, float comissao, String nome, float horasTrabalho, float valorHora){
        super(salario, nome, horasTrabalho, valorHora);
        this.comissao = comissao;
    }
    
    public void setComissao(float comissao){
        this.comissao = comissao;
    }
    
    public float getComissao(){
        return this.comissao;
    }
     @Override
    public String toString(){
        return "\n\nGerente: \n"+ super.toString() + "\n Comissão" + this.comissao;
    }
    
     @Override
    public void calculaSalario(){
        super.calculaSalario();
        this.salario = this.salario + this.comissao;
    }
}