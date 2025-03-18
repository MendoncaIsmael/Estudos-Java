public class SmartTv {
    boolean power=false;
    int channel=1;
    int volume=25;
   
    
public void mudarCanal(int newChannel){
        channel=newChannel;
}

    public void avancarCanal(){
        channel++;
        System.out.println("Avançando para o canal " +channel);
    }

    public void retrocederCanal(){
        channel--;
        System.out.println("Retrocedendo para o canal " +channel);
    }
    
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " +volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o voume para " +volume);
    }



    public void ligar(){
        power=true;
    }
   
    public void desligar(){
        power=false;
    }
    public void resPower(){
        String resPower=power?"A Tv está ligada!":"A Tv está desligada!";
        System.out.println(resPower);
    }
}
