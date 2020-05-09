/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaudemy;

public class JavaHeranca extends JavaUdemy{
    private int cnpj;
    
    public JavaHeranca(String nome, String sexo, int idade, int cnpj) {
        super(nome,sexo,idade);
        this.cnpj=cnpj;
    }
}
