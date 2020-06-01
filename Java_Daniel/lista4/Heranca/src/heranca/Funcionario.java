package heranca;
public class Funcionario {
    protected float salario;
    protected String nome;
    protected float horasTrabalho;
    protected float valorHora;
    
    public Funcionario(){
        
    }
    
    public Funcionario(float salario, String nome, float horasTrabalho, float valorHora){
        this.salario = salario;
        this.nome = nome;
        this.horasTrabalho = horasTrabalho;
        this.valorHora = valorHora;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    public void setHorasTrabalho(float horasTrabalho){
        this.horasTrabalho = horasTrabalho;
    }
    public void setValorHora(float valorHora){
        this.valorHora = valorHora;
    }
    
    
    
    public String getNome(){
        return this.nome;
    }
    public float getSalario(){
        return this.salario;
    }
    public float getHorasTrabalho(){
        return this.horasTrabalho;
    }
    public float getValorHora(){
        return this.valorHora;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome+
                "\n Salario: " + this.salario+
                "\n Horas de trabalho: " + this.horasTrabalho +
                "\n Valor da Hora: " + this.valorHora;
    }
    
    public void calculaSalario(){
        this.salario = this.horasTrabalho * this.valorHora;
    }
    
}
