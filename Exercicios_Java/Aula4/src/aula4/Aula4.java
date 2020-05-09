package aula4;

public class Aula4 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.45f);
        Caneta c2 = new Caneta("cccC", "Laranja", 4.45f);
//        c1.setModelo("Bic");
//        c1.setPonta(0.5f);
        c1.status();
        c2.status();
        System.out.println("Tenho uma caneta "+ c1.getModelo() + " de ponta " + c1.getPonta());
    }
    
}
