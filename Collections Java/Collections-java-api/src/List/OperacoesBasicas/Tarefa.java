package List.OperacoesBasicas;

public class Tarefa {
    //atributo 
    private String descricao;
    
    public Tarefa(String descricao){
    this.descricao=descricao;
    }
    //criando o método get 
    public String getDescricao() {
        return descricao;
    }
    @Override
    public String toString() {
        return descricao;
    }
    
}
