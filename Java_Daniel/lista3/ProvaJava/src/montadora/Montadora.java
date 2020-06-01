package montadora;

import java.util.ArrayList;

public class Montadora {
    private String nome;
    private String cnpj;
    private ArrayList<Veiculo> veiculos;
    
    
    public Montadora(){
        this.veiculos = new ArrayList();
    }
    
    public Montadora(String nome, String cnpj, ArrayList<Veiculo> veiculo){
        this.nome = nome;
        this.cnpj = cnpj;
        this.veiculos = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    @Override
    public String toString(){
        return "Montadora: "+
                "\n Nome: "+ this.nome+
                "\n CNPJ: "+ this.cnpj+
                this.veiculos;
    }
    
    
    public int getVeiculo(Veiculo veiculo){
        return this.veiculos.indexOf(veiculo);
    }
    public void addVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    public boolean removeVeiculo(Veiculo veiculo){
        return this.veiculos.remove(veiculo);
    }
    public boolean updateVeiculo(Veiculo atual, Veiculo novo){
        int pos = this.getVeiculo(atual);
        if(pos != -1){
            this.veiculos.set(pos, novo);
            return true;
        }
        else{ 
            return false;
        }
    }
}
