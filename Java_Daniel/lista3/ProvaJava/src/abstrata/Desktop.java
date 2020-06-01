
package abstrata;
public class Desktop extends Computador{
    private float tamGap;

    public Desktop(float tamGap, String tipo) {
        super(tipo);
        this.tamGap = tamGap;
    }

    public void setTamGap(float tamGap) {
        this.tamGap = tamGap;
    }

    public float getTamGap() {
        return tamGap;
    }

    @Override
    public String toString() {
        return "Computador: "+ super.toString()+
                "Desktop{" + "tamGap=" + tamGap + '}';
    }
    
}
