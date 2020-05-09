package br.edu.fatecfranca.ads.exe0;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        Carro obj1 = new Carro("VW", "Gol", false, 0);
        obj1.ligar();
        obj1.acelerar(90);
        obj1.frear(10);
        
        JOptionPane.showMessageDialog(null, obj1.toString());
    
        Carro obj2 = new Carro("GM", "Onix", true, 100);
        obj2.frear(30);
        obj2.desligar();
        
        JOptionPane.showMessageDialog(null, obj2.toString());
    
        String marca = JOptionPane.showInputDialog("Informe a marca:");
        String modelo =JOptionPane.showInputDialog("Informe o Modelo:");
        float velocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade"));
        int resp = JOptionPane.showConfirmDialog(null, " Motor está ligado?", "Status Motor", JOptionPane.YES_NO_OPTION);
        boolean motor = (resp == JOptionPane.YES_OPTION);
        
        Carro obj3 = new Carro(marca, modelo, motor, velocidade);
        JOptionPane.showMessageDialog(null, obj3.toString());
        
        Carro obj4 = new Carro();
        JOptionPane.showMessageDialog(null, obj4.toString());
    }
    
}
