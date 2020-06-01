package montadora;
public class TestMontadora {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo("Gol", "2006");
        Veiculo v3 = new Veiculo();
        v3.setModelo("Astra");
        v3.setAno("2005");
        
        
        Montadora montadora = new Montadora();
        
        montadora.setNome("Chevrolet");
        montadora.setCnpj("123.234.432/09.1");
        montadora.addVeiculo(v3);
        montadora.addVeiculo(v2);
        
        System.out.println(montadora.toString());
        
        montadora.updateVeiculo(v3, v1);
        
        System.out.println(montadora.toString());
        
    }
    
}
