package br.com.heranca.sistemaagendamento;
public class TestClinica {
    
     public static void Consulta(Pessoa pessoa){
                
        pessoa.consulta(); // polimorfismo
    }
    
    public static void main(String[] args) {
        Medico medico1 = new Medico("joao", "Rua jose das colinas 1254", "32467859", "1299", "Especialista");
        Paciente paciente1 = new Paciente("Ana", "Rua da cruz 925", "2972465735", "11/07/1989","666.333.999-14");
        Paciente paciente2 = new Paciente("Bernardo", "Rua jose das colinas 7895", "8593745", "13/12/2005", "345.234.654-12");
        
        Recepcionista rec = new Recepcionista("Flavia", "Rua da cruz 925", "2972465735", 1830.43f ,"Femenino");
        
        Clinica clinica = new Clinica ();
        clinica.setOwner("José alfrede do neves");
        clinica.setCnpj("789.342.432/34");
        clinica.setSocialReason("Clinica psicologica ltda");
        clinica.setAdress("Rua moacir freitas 343");
        
        
        clinica.addPessoa(medico1);
        clinica.addPessoa(rec);
        clinica.addPessoa(paciente1);
        clinica.addPessoa(paciente2);
        
        
               
        System.out.println(clinica.toString());
        
        
        TestClinica.Consulta(paciente1);
        TestClinica.Consulta(paciente2);
        TestClinica.Consulta(rec);
        TestClinica.Consulta(medico1);        
    }
    
}
