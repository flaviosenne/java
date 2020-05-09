package lista3exercicio1;

public class Voo {
    private String numero;
    private String destino;
    
    // associação
    private Reserva reserva;
    
    public Voo(){
        this.numero = "indefinido";
        this.destino = "indefinido";
    }
    public Voo(String n, String d){
        this.numero = n;
        this.destino = d;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }
    public String getNumero(){
        return this.numero;
    }
    public String getDestino(){
        return this.destino;
    } 
    public void setReserva(Reserva reserva){
        this.reserva = reserva;
    }
    public String toString(){
        return "Numero do Voo: "+ getNumero()+
                "\nDestino: "+ getDestino();
    }
}
