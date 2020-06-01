package heranca;
public class TestHeranca {
    
    public static void calculaSalarioMostra(Funcionario camaleao){
        
        //se o camaleao recebe um gerente, ele executa o calculaSalario() do gerente
        //se o camaleao recebe um diretor, ele executa o calculaSalario() do diretor
        camaleao.calculaSalario(); // polimorfismo
        
        //se o camaleao recebe um gerente, ele executa o toString() do gerente
        //se o camaleao recebe um diretor, ele executa o toString() do diretor
//        System.out.println(camaleao.toString()); // polimorfismo;
    }
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente(0, 2000, "Joao", 40, 30);
        
        TestHeranca.calculaSalarioMostra(gerente1);
        
        Diretor diretor1 = new Diretor(4000, "Corvete", 0,  "Daniel", 40, 40);
        
        TestHeranca.calculaSalarioMostra(diretor1);
               
        
             
        Departamento dep1 = new Departamento();
        dep1.setNome("Informatica");
        dep1.setSetor("Software");
        
        dep1.addFuncionario(diretor1);
        dep1.addFuncionario(gerente1);
//        System.out.println(gerente1);
//        System.out.println(diretor1);

        System.out.println(dep1.toString());
    }
    
}
