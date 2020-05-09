package arraylist;

import java.util.ArrayList;

public class Curso {
    private int id;
    private String nome;
    //associação n
    private ArrayList<Disciplina> disciplinas;
    public Curso() {
        this.disciplinas = new ArrayList();
    }

    public Curso(int id, String nome, ArrayList<Disciplina> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.disciplinas = disciplinas;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
   
    
    //CRUD
    //Inserção
    public void adicionarDisciplina(Disciplina d){
        System.out.println("-->"+this.disciplinas);
        this.disciplinas.add(d);
    }
    //Remoção
    public void removerDisciplina(Disciplina r){
        this.disciplinas.remove(r);
    }
    //Busca
    public int buscaDisciplina(Disciplina b){
        return this.disciplinas.indexOf(b);
    }
    //Atualiza
    public boolean atualizaDisciplina(Disciplina atual, Disciplina nova){
        int i = this.buscaDisciplina(atual);
        if(i != -1){
            this.disciplinas.set(i, nova);
            return true;
        }else{
            return false;
        }
    }

    
     public String toString(){
        return "ID: "+ getId()+
                "\nNome Curso: "+ getNome()+
                "\nLista: "+ getDisciplinas();
    }
    
}
