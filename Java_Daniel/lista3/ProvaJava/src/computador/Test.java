package computador;

public class Test {

    public static void main(String[] args) {
        Computador comp1 = new Computador();
        Computador comp2 = new Computador(true, false, false, 8);
        
        System.out.println(comp1.toString());
        
        comp1.aumentar(4);
        comp1.aumentar(3);
        System.out.println(comp1.toString());
        
        comp2.setDesligar();
        System.out.println(comp2.toString());
    }
    
}
