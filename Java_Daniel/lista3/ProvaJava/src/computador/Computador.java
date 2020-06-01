package computador;
public class Computador {
    private Boolean ligado;
    private Boolean desligado;
    private Boolean repouso;
    private Integer memoria;
    
    public Computador(){
        this.ligado = false;
        this.repouso = false;
        this.desligado = true;
        this.memoria = 4;
    }
    
    public Computador(Boolean ligado, Boolean desligado, Boolean repouso, Integer memoria){
        this.ligado = ligado;
        this.desligado = desligado;
        this.repouso = repouso;
        this.memoria = memoria;
    }
    
    public void setLigar(){
        this.ligado = true;
        this.desligado = false;
    }
    public void setDesligar(){
        this.desligado = true;
        this.ligado = false;
    }
    public void setRepouso(){
        this.repouso = true;
        this.desligado = false;
    }
    public void setMemoria(Integer x){
        if((x == 4) || (x == 8) || (x == 16) || (x == 32)){
            this.memoria = x;
        }else{
            System.out.println("Memória inválida");
        }        
    }
    
    
    public Boolean getDesligar(){
        return this.desligado;
    }
    public Boolean getLigar(){
        return this.ligado;
    }
    public Boolean getRepouso(){
        return this.repouso;
    }
    public Integer getMemoria(){
        return this.memoria;
    }
    
    public void aumentar(Integer x){
        Integer aux = this.memoria;
        
        if((aux + x == 8) || (aux + x == 16) || (aux + x == 32)){
            this.memoria = this.memoria + x; 
        }else{
            System.out.println("Valor inválido");
        }
    }
    
    @Override
    public String toString(){
        return " Computador \n" +
                "Estados: " + 
                "\n ligado: " + this.ligado +
                "\n desligado: " + this.desligado+
                "\n repouso: " + this.repouso+
                "\n Memória: " + this.memoria;
    }
}
