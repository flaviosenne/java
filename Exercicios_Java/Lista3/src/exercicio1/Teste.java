package exercicio1;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
           Conta objParte = new Conta();
           objParte.setNumeroAgencia("13244-x");
           objParte.setNome("João");
           objParte.setNumeroConta("01093753-1");
           objParte.setSaldo(2000);
           
           
           Cartao objTodo = new Cartao();
           //agregação
           objTodo.setConta(objParte);
           objTodo.setCvv(688);
           objTodo.setNumero("123457-8");
           objTodo.setSenha("1234");
           objTodo.setValidade("12/12");
           
           System.out.println(objTodo.toString());
           JOptionPane.showMessageDialog(null, objTodo.toString());
    }
    
}
