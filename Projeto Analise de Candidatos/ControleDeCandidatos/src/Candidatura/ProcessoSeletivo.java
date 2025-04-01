package Candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo{
    public static void main(String[] args){
       selecaoCandidatos();
       imprimirSelecionados();

       String[] candidatos={"João", "Maria", "Pedro", "Ana", "Lucas"};
       for(String candidato:candidatos){
          entrandoEmContato(candidato);
       }
     
       
    }   
     static void entrandoEmContato(String candidato) {
        int tentativas=1;
        boolean continuarTentando=true;
        boolean atendeu=false;
        do { 
            atendeu=atender();
            continuarTentando= !atendeu;
            if (continuarTentando){  
                tentativas++;}
            else 
                System.out.println("O candidato "+candidato+" atendeu na "+tentativas+"° tentativa de contato. ");
            
        } while (continuarTentando && tentativas<=3);
        }
     static boolean atender(){
        return new Random().nextInt(3)==1;
     }
    
        static void imprimirSelecionados(){
                
            String[] candidatos={"João", "Maria", "Pedro", "Ana", "Lucas"};
            
            System.out.println("Imprimindo o índicee dos candidatos:");
            
            for (int indice=0;indice<candidatos.length;indice++){
                System.out.println("O candodato de n° "+(indice+1)+" é "+candidatos[indice]);
            }
           
        }
        static void selecaoCandidatos(){
            String[] candidatos={"João", "Maria", "Pedro", "Ana", "Lucas","Daiana","Luiz"};
        
            int candidatosSelecionados=0;
            int candidatosAtual=0;
            double salarioBase=2000.0;
            
            while(candidatosSelecionados<5 && candidatosAtual<candidatos.length){
                String candidato=candidatos[candidatosAtual];
                double salarioPretendido=valorPretendido();

                System.out.println("O Candidato "+candidato+" Solicitou este valor de salário: R$ "+salarioPretendido);
                if(salarioBase>=salarioPretendido){
                    System.out.println("O candidato "+candidato+" foi selecionado para a vaga.");
                    candidatosSelecionados++;
                }
               candidatosAtual++;
              } 
            }
            
        static double valorPretendido(){
               return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }
       static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM  CONTRAPROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS ");
        }
       }}
    

