package lista3exercicio1;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class TestaPassageiros {

    public static void main(String[] args) {
        Passageiros partePassageiro = new Passageiros();
        partePassageiro.setNome("José dos Alfaces");
        partePassageiro.setCpf("123.455.675-12");
        
        Voo todoVoo = new Voo();
        todoVoo.setNumero("12345");
        todoVoo.setDestino("Amazonas");
        // pegar o horario
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2018);
        c.set(Calendar.MONTH, Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH, 20);
        
        Reserva todoReserva = new Reserva();
        todoReserva.setPassageiros(partePassageiro);
        todoReserva.setCodigo(123);
        todoReserva.setData(c.getTime()); // atribui 20/03/2018 para a reserva
        todoReserva.setVoo(todoVoo);
        
        
        System.out.println(todoReserva.toString());
        JOptionPane.showMessageDialog(null, todoReserva.toString());
        
    }
    
}
