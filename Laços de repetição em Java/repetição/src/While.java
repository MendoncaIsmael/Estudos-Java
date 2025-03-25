/*Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, 
 *logo, enquanto o valor dos doces não igualar a R$50,00 ele doi adicionando itens
 * ao seu carrinho.
 */
import java.util.concurrent.ThreadLocalRandom; //importando a biblioteca para gerar números aleatórios

public class While {
    public static void main(String[] args) {
        double mesada=50.0;
        while(mesada>0){
            Double valorDoce=valorAleatorio();
            if(valorDoce>mesada)
                valorDoce=mesada;
                
            System.out.println("Doce do valor: "+valorDoce+" adicionado ao carrinho");
            mesada=mesada-valorDoce;
            
        }
        System.out.println("Mesada: "+mesada );
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    } 
       private static double valorAleatorio(){ //dedclaração da função que gera valores aleatórios.
            return ThreadLocalRandom.current().nextDouble(2,8);//range dos valores aleatórios que os doces podem receber
    }
}
