
import java.util.List;
import java.util.ArrayList;





public class CarrinhoDeCompra {
    private List<Item> produto;

    public CarrinhoDeCompra(){
    this.produto=new ArrayList<>();
    }
        //criando a função para adicionar os itens
        //As funções são declaradas como public, para que o programa tenha acesso às mesmas.
        //As funções são implementadas como void, pois n retornam nenhum valor.
    public void adicionarItem(String nome, double preco, int quantidade){
        produto.add(new Item(nome, preco, quantidade));
    }
    //Criando a função para remover itens.
    public void removerItem(String nome){
        List<Item> removerProduto = new ArrayList<>();
        for(Item i: produto){
        if(i.getNome().equalsIgnoreCase(nome)){
            removerProduto.add(i);
        }
        produto.removeAll(removerProduto);
    }
    
    }
    
    //Criando a função para calcular o valor total do carrinho.
    public double calcularTotal(){
        double total=0;
        for(Item i: produto){
            total+=i.getPreco()*i.getQuantidade();
        }
        return total;
    }
    //Criando a função para listar os itens do carrinho.
    public void listarItens(){
        for(Item i: produto){
            System.out.println("Produto: "+i.getNome()+", Valor: R$ "+i.getPreco()+" , Und: "+i.getQuantidade()+"\n");
        }
    }
    //Testando as funções do carrinho de compras.
    //Criando a função main para executar o programa.
    public static void main(String[]args){
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        System.out.println("O número total de ítens no seu carrinho é de: "+carrinho.produto.size()+"\n");

        carrinho.adicionarItem("Xbox", 2500.00,1);
        carrinho.adicionarItem("FIFA 2025", 300.00, 1);
        carrinho.adicionarItem("Energético", 9.00, 2);
        System.out.println("Existem "+ carrinho.produto.size()+" ítens em seu carrinho! \n");
      
        System.out.println("O número total de ítens no seu carrinho é de: "+carrinho.produto.size()+"\n");
        
        carrinho.listarItens();
        System.out.println("O valor total do seu carrinho é de: R$"+carrinho.calcularTotal());

    }
}