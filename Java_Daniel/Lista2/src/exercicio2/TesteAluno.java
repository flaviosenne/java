package exercicio2;
import javax.swing.JOptionPane;
public class TesteAluno {

    public static void main(String[] args){
        // teste suave
        Aluno aluno1 = new Aluno(123456, "joao", 20, 6, 8);
        aluno1.notaFinal();
        System.out.println(aluno1.toString());
        JOptionPane.showMessageDialog(null, aluno1.toString());
        
        
        // teste padrão
        Aluno aluno2 = new Aluno();
        System.out.println(aluno2.toString());
        JOptionPane.showMessageDialog(null, aluno2.toString());
        
        // teste de erro
        Aluno aluno3 = new Aluno(123452346, "lucas", 14, 6.4f, -8);
        aluno3.notaFinal();
        System.out.println(aluno3.toString());
        JOptionPane.showMessageDialog(null, aluno3.toString());
    }
}
