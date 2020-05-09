package exercicio1;

import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
        Produto obj1 = new Produto(1, "mesa", 4, 240);
        obj1.comprarProduto(5);
        obj1.venderProduto(3);
        obj1.subirPreco(13);
        obj1.descerPreco(10);
        
        JOptionPane.showMessageDialog(null, obj1.toString());
    
        Produto obj2 = new Produto();
        JOptionPane.showMessageDialog(null, obj2.toString());
        
    
        int id = Integer.parseInt(JOptionPane.showInputDialog("Informe a identificação")); 
        String descricao = JOptionPane.showInputDialog("Informe a descrição");
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preco"));
        
        Produto obj3 = new Produto(id, descricao, qtd, preco);
        JOptionPane.showMessageDialog(null, obj3.toString());
    }
    
    
}