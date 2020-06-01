package heranca;
public class Diretor extends Funcionario{
    private float bonus;
    private String carro;
    
    public Diretor(){
        super();
    }
    public Diretor(float bonus, String carro,float salario, String nome, float horasTrabalho, float valorHora){
        super(salario,nome, horasTrabalho, valorHora);
        this.bonus = bonus;
        this.carro = carro;
        
    }
    
    public void setBonus(float bonus){
        this.bonus = bonus;
    }
    public void setCarro(String carro){
        this.carro = carro;
    }
    
    public float getBonus(){
        return this.bonus;
    }
    public String getCarro(){
        return this.carro;
    }
    
    @Override // anula o metodo que herdou
    public String toString(){
        return "\n\nDiretor: \n"+ super.toString()+
                "\n Bonus: " + this.bonus +
                "\n Carro: "+ this.carro;
        }
    
    @Override
    public void calculaSalario(){
        super.calculaSalario();
        this.salario = this.salario + this.bonus;
    }
}
