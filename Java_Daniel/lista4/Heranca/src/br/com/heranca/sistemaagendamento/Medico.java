package br.com.heranca.sistemaagendamento;
public class Medico extends Pessoa {
    private String crm;
    private String formation;
    
    public Medico(){
        super();
    }
    
    public Medico(String name, String adress, String contact, String crm, String formation){
        super(name,adress,contact);
        this.crm = crm;
        this.formation = formation;
    }
    
    public void setCrm(String crm){
        this.crm = crm;
    }
    public void setFormation(String formation){
        this.formation = formation;
    }
    
    public String getCrm(){
        return this.crm;
    }
    public String getFormation(){
        return this.formation;
    }
    
    @Override  
    public String toString(){
        return "\n\n Medic: " + super.toString()+
                "\nCRM: "+this.crm+
                "\n Formtion: "+ this.formation;
    }
    
    @Override
    public void consulta(){
        System.out.println("\n" + super.getName()+ " Consultou o paciente");
    }
}
