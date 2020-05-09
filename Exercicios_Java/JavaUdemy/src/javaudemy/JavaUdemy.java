/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaudemy;

/**
 *
 * @author joao & gaby
 */
public class JavaUdemy{
    private String nome;
    private String sexo;
    private int idade;
    
    public JavaUdemy(String nome, String sexo, int idade){
        // this refere-se a classe JavaUdemy
        // a classe construtora pega os atributos(variáveis declaradas no inicio)
        // e recebe os argumentos (parametros nome, sexo e idade)
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    // metodo getName retorna o atributo nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getsexo(){
        return sexo;
    }
    public void setsexo(String sexo){
        this.sexo = sexo;
    }
    
}
