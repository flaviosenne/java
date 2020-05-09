
package exercicio2;

import javax.swing.JOptionPane;

public class TesteRio {
    public static void main(String[] args) {
        Rio obj = new Rio("eufrates", 4, false);
        obj.chover(4);
        obj.ensolarar(2);
        obj.limpar();
        obj.sujar();
        
        JOptionPane.showMessageDialog(null, obj.toString());
    
        Rio obj2 = new Rio();
        JOptionPane.showMessageDialog(null, obj2.toString());
    
        
        String nome = JOptionPane.showInputDialog("Informe o nome do rio");
        int nivel = Integer.parseInt(JOptionPane.showInputDialog("Informe o nivel do rio"));
        int resposta = JOptionPane.showConfirmDialog(null, "O rio está poluído?", "Poluição do Rio", JOptionPane.YES_NO_OPTION); 
        boolean poluido = (resposta == JOptionPane.YES_NO_OPTION);
        
        Rio obj3 = new Rio(nome, nivel, poluido);
        JOptionPane.showMessageDialog(null, obj3.toString());
        
    }
    
}

