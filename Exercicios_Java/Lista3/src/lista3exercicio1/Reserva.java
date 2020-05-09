package lista3exercicio1;

import java.util.Date;

public class Reserva {
    private int codigo;
    private Date data;
    
    // associação
    private Passageiros passageiros;
    private Voo voo;
    
    public Reserva(int c, Date d){
        this.codigo = c;
        this.data = d;
    }
    public Reserva(){
        this.codigo = 0;
        this.data = new Date();
    }
    public void setCodigo(int c){
        this.codigo = c;
    }
    public void setData(Date d){
        this.data = d;
    }
    public void setPassageiros(Passageiros passageiros){
        this.passageiros = passageiros;
    }
    public void setVoo(Voo voo){
        this.voo = voo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public Date getData(){
        return this.data;
    }
    public String toString(){
       return "Codigo da Reserva: "+ getCodigo()+
            "\nData: "+ getData()+
               "\n"+passageiros.toString()+
               "\n"+voo.toString();
    }
    
}

