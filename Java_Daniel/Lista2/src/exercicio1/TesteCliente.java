package exercicio1;
import javax.swing.JOptionPane;
public class TesteCliente {
    public static void main(String[] args){
        Cliente fulano = new Cliente("123456-7", "123-45", "Fulano", 1000);
        fulano.realizarDeposito(100);
        fulano.realizarSaque(100);
        fulano.realizarSaque(1600);
        
        JOptionPane.showMessageDialog(null, fulano.toString());
        System.out.println(fulano.toString());
    
    
        Cliente beltrano = new Cliente("76543-21", "543-21", "Beltrano", 400);
        beltrano.realizarDeposito(-50);
        beltrano.realizarSaque(500);           
    
        JOptionPane.showMessageDialog(null, beltrano.toString());
        System.out.println(beltrano.toString());
    
        
        
        Cliente ciclano = new Cliente();
        
        JOptionPane.showMessageDialog(null, ciclano.toString());
        System.out.println(ciclano.toString());
    }
        
    
}
