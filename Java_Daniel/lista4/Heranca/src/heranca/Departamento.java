package heranca;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private String setor;
    private ArrayList<Funcionario> funcionarios;
    
    public Departamento(){
        this.funcionarios = new ArrayList();
    }
    public Departamento(String nome, String setor, ArrayList<Funcionario> func){
        this.nome = nome;
        this.setor = setor;
        this.funcionarios = func;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getSetor(){
        return this.setor;
    }
    
    @Override
    public String toString(){
        return "\n Nome: " + this.nome+
                "\n Setor: " + this.setor+
                "\n Funcionario: "+ this.funcionarios;
    }
    
    // adiciona gerente ou diretor, depende apenas do tipo do funcionario passado
    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
}
