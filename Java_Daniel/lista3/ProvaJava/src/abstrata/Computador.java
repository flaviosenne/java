package abstrata;

public abstract class Computador {
    protected String tipo;

    public Computador(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Computador{" + "tipo=" + tipo + '}';
    }
    
    
    
}
