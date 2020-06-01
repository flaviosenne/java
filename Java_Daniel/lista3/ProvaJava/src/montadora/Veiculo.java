
package montadora;

public class Veiculo {
    private String modelo;
    private String ano;
    
    
    public Veiculo(){
        this.modelo = "Não informado";
        this.ano = "Não informado";
    }
    
    public Veiculo(String modelo, String ano){
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void setAno(String ano){
        this.ano = ano;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getAno(){
        return this.ano;
    }
    public String getModelo(){
        return this.modelo;
    }
    
    @Override
    public String toString(){
        return "\n Veidulo" +
                "\n Modelo: " + this.modelo +
                "\n Ano: "+  this.ano;
    }
}
