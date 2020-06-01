
package abstrata;

public class Test {
    public static void Adicionar(Computador micro){
        Lanhouse lan = new Lanhouse();
        
        lan.addMicro(micro); // polimorfismo 
        // a Lanhouse adiciona as duas classes filhas atraves da classe Computador com o mesmo método (addMicro)
        
        System.out.println(lan.toString());
        
    }
    public static void main(String[] args) {
        Desktop desktop = new Desktop(20045, "desktop");
        Notebook note1 = new Notebook(47298, "note");
        Notebook note2 = new Notebook(62398, "note");

             
        
        Test.Adicionar(note1);
        Test.Adicionar(note2);
        Test.Adicionar(desktop);
        
          
        
        
        

    }
    
}
