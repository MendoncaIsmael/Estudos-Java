public class Item {
    //atributos do objeto Item
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }
    //Criando os métodos get e set para acessar os atributos do objeto Item.

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
}

