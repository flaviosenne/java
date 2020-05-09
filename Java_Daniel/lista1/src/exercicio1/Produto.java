package exercicio1;

public class Produto {
    private int id;
    private String descricao;
    private int qtd;
    private float preco;

    Produto(int id, String descricao, int qtd, float preco) {
         this.id = id;
         this.descricao = descricao;
         this.qtd = qtd;
         this.preco = preco;
    }

    Produto() {
        this.id = 0;
        this.descricao = "Não definido";
        this.qtd = 0;
        this.preco = 0;
    }
    
    public void comprarProduto(int x){
        this.qtd = this.qtd + x;
    }
    public void venderProduto(int x){
        this.qtd = this.qtd - x;
    }
    public void subirPreco(float x){
        this.preco = this.preco + x;
    }
    public void descerPreco(float x){
        this.preco = this.preco - x;
    }
    
    public String toString(){
        return "id: " + this.id +
                "\n Descrição: " + this.descricao +
                "\n Quantidade: " + this.qtd +
                "\n Preço " + this.preco;
    }
}
