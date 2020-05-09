package arraylist;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TesteArray {
    public static void main(String[] args) {
        Disciplina dis = new Disciplina();
        dis.setNome("POO");
        dis.setId(2);
           
        
        Curso curso = new Curso();
        curso.adicionarDisciplina(dis);
        curso.setNome("ADS");
        curso.setId(4);
        curso.adicionarDisciplina(dis);
        dis.setNome("Estrutura de dados");
        dis.setId(3);
        int i = Integer.parseInt(JOptionPane.showInputDialog("Informe o id"));
        String n = JOptionPane.showInputDialog("Informe o nome da disciplina");
        dis.setId(i);
        dis.setNome(n);
        curso.adicionarDisciplina(dis);
//        curso.buscaDisciplina(dis);
//        
        // listar
        JOptionPane.showMessageDialog(null, curso.toString());
        System.out.println(curso.toString());
    }
    
}
