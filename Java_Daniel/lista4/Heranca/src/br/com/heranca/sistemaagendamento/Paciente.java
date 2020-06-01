package br.com.heranca.sistemaagendamento;
public class Paciente extends Pessoa{
    private String age;
    private String cpf;
    
    public Paciente(){
        super();
    }
    
    public Paciente(String name, String adress, String contact, String age, String cpf){
        super(name,adress,contact);
        this.age = age;
        this.cpf = cpf;
    }
    
    public void setAge(String age){
        this.age = age;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getAge(){
        return this.age;
    }
    public String getCpf(){
        return this.cpf;
    }
    
    @Override
    public String toString(){
        return "\n\n Paciente: " + super.toString()+
                "\nData de Nascimento: "+this.age+
                "\n CPF: "+ this.cpf;
    }
    
    @Override
    public void consulta(){
        System.out.println("\n" +getName() + " Solicita uma consulta");
    }
}
