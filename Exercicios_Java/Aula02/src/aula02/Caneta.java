package aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    void status(){
        System.out.println("---------------------------");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("A caneta está tampada? " + this.tampada);
        System.out.println("----------------------------");
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não Pode Rabiscar");
        }else{
            System.out.println("Raabisco feito");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
