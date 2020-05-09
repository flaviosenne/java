
package br.edu.fatecfranca.ads.exe0;

public class Carro {

    private String marca;
    private String modelo;
    private boolean motor;
    private float velAtual;
    // metodos

    Carro(String marca, String modelo, boolean motor, float velAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.velAtual = velAtual;
    }

    Carro() {
        this.marca = "Não definido";
        this.modelo = "Não definido";
        this.motor = false;
        this.velAtual = 0;
    }
    
    public void ligar(){
        this.motor = true;
    }
    public void desligar(){
        this.motor = false;
        this.velAtual = 0;
    }
 
    public void acelerar(float x) {
        if(this.motor){
             this.velAtual = this.velAtual + x;   
        } 
    }   
    public void frear(float x){
        if(this.velAtual - x >= 0){
         this.velAtual = this.velAtual - x;   
        }
        
    }
    public String toString(){
        return "Marca: " + this.marca +
                "\n Modelo: " + this.modelo +
                "\n Motor: " + this.motor +
                "\n Vel: " + this.velAtual;
    }
}