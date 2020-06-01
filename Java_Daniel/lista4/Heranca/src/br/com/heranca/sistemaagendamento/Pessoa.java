package br.com.heranca.sistemaagendamento;
public class Pessoa {
    protected String name;
    protected String adress;
    protected String contact;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String name, String adress, String contact){
        this.name = name;
        this.adress = adress;
        this.contact = contact;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    
    
    public String getName(){
        return this.name;
    }
    public String getAdress(){
        return this.adress;
    }
    public String getContact(){
        return this.adress;
    }
    
    @Override
    public String toString(){
        return "\nName: " + this.name+
            "\n Contact: " + this.contact+
            "\n Adress: "+ this.adress;
    }
    
    public void consulta(){
        System.out.println("Agendar consulta");
    }
    
}
