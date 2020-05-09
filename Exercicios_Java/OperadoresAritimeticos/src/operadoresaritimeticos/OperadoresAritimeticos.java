/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author joao & gaby
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a "+ m);
        
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);
        
        int x = 4;
        x *= 2;
        System.out.println(x);
        
        float z = 4.4f;
//        int arr = (int) Math.floor(z);
        int arr = (int) Math.round(z);
        System.out.println(arr);
        
        float aleatorio = (float) Math.random();
        int ze = (int)(15+ aleatorio * (50-15));
        System.out.println(ze);
        
    }
    
}
