package br.com.heranca.sistemaagendamento;
public class Recepcionista extends Pessoa {
    private float salario;
    private String sex;
    
    public Recepcionista(){
        super();
    }
    
    public Recepcionista(String name, String adress, String contact, float salario, String sex){
        super(name,adress,contact);
        this.salario = salario;
        this.sex = sex;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    
    public float getSalario(){
        return this.salario;
    }
    public String getSex(){
        return this.sex;
    }
    
   @Override
    public String toString(){
        return "\n\n Recepcionista: " + super.toString()+
                "\nSalario "+this.salario+
                "\n Sexo: "+ this.sex;
    }
    
    @Override
    public void consulta(){
        System.out.println("\n" + super.getName() + " Agendou a consulta");
    }
}
