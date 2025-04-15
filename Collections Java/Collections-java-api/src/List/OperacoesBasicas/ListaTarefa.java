package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa{
    
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

        public void adicionarTarefa(String descricao){
         tarefaList.add(new Tarefa(descricao));    
            
        }
        
        public void removerTarefa(String descricao){
            List<Tarefa> tarefasParaRemover = new ArrayList<>();
            for(Tarefa t:tarefaList){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        }
        //obter o numero total de tarefas
        public int obterONumeroTotalDeTarefas(){
            return tarefaList.size();
        }
        public void obterDescricoestarefas(){
            System.out.println(tarefaList);
        }
    
        //Testando as funções adicionar, remover, obter o número total de tarefas e descrição de tarefas.
    
        public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();  
        System.out.println("O númeto Total de tarefas é: " + lista.obterONumeroTotalDeTarefas());  
        
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Estudar Python");
        System.out.println("O númeto Total de tarefas é: " + lista.obterONumeroTotalDeTarefas());
    
        lista.removerTarefa("Estudar Java");
        System.out.println("O númeto Total de tarefas é: " + lista.obterONumeroTotalDeTarefas());
    

        lista.obterDescricoestarefas();

    
    
    }
    }

    
    
    
