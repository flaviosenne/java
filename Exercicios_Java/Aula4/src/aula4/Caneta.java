package aula4;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampada(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a Caneta");
        System.out.println("--------------");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: "+ this.getCor());
        System.out.println("Tampada "+ this.getTampada());
        System.out.println("--------------");
    }
}
