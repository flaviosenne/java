
package abstrata;

public class Notebook extends Computador{
    private float capBat;

    public float getCapBat() {
        return capBat;
    }

    public Notebook(float capBat, String tipo) {
        super(tipo);
        this.capBat = capBat;
    }

    public void setCapBat(float capBat) {
        this.capBat = capBat;
    }

    @Override
    public String toString() {
        return "Computador: "+ super.toString()+
                "Notebook{" + "capBat=" + capBat + '}';
    }

    
}
