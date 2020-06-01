package br.com.heranca.sistemaagendamento;

import java.util.ArrayList;

public class Clinica {
    private String cnpj;
    private String socialReason;
    private String adress;
    private String owner;
    private ArrayList<Pessoa> pessoa;
    
    
    public Clinica(){
        this.pessoa = new ArrayList();
    }
    
    public Clinica(String owner, String cnpj, String socialReason, String adress, ArrayList<Pessoa> pessoa){
        this.owner = owner;
        this.cnpj = cnpj;
        this.socialReason = socialReason;
        this.adress = adress;
        this.pessoa = pessoa;
    }
    
    
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public void setSocialReason(String social){
        this.socialReason = social;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    
    public String getOwner(){
        return this.owner;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    public String getSocialReason(){
        return this.socialReason;
    }
    public String getAdress(){
        return this.adress;
    }
    
    @Override
    public String toString(){
        return "Clinica: \n"+
                "\nProprietário: "+ this.owner+
                "\nCNPJ: "+ this.cnpj+
                "\nRazão Social: "+ this.socialReason+
                "\nEndereço: "+ this.adress+
                "\nPessoas: \n"+
                this.pessoa;
//                this.medico.toString()+
//                this.recepcionista.toString()+
//                this.paciente.toString();
    }
    
    
    public int getPessoa(Pessoa pessoa){
        return this.pessoa.indexOf(pessoa);
    }
    public void addPessoa(Pessoa pessoa){
        this.pessoa.add(pessoa);
    }
    public boolean removePessoa(Pessoa pessoa){
        return this.pessoa.remove(pessoa);
    }
    public boolean updatePessoa(Pessoa actual, Pessoa neew){
        int pos = this.getPessoa(actual);
        if(pos != -1){
            this.pessoa.set(pos, neew);
            return true;
        }
        else{ 
            return false;
        }
    }
    
}
