package abstrata;

import java.util.ArrayList;

public class Lanhouse {
    private ArrayList<Computador> micros;
    
   
    public Lanhouse(){
        this.micros = new ArrayList();
    }
    public void addMicro(Computador micro){
        this.micros.add(micro);
    }
    
    
     @Override
    public String toString(){
        return "Lanhouse: "+
                this.micros;
    }
}
