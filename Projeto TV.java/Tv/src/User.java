public class User {
    public static void main(String[] args) throws Exception {
      SmartTv smartTv = new SmartTv();
       

      //Ligando a TV 
    smartTv.ligar();
    System.out.println("Ligando a Tv...");
    smartTv.resPower();
     
    

    //Verificnado o volume da TV
    System.out.println("O volume da Tv está em : "+smartTv.volume);
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    System.out.println("O volume da Tv está em : "+smartTv.volume);


    //Verificando em qual canal a TV está
    System.out.println("A Tv está no canal: "+smartTv.channel);
    smartTv.mudarCanal(13);
    System.out.println("A Tv está no canal: "+smartTv.channel);
   

    //Desligando a Tv
    smartTv.desligar();
    System.out.println("Desligando a Tv...");
    smartTv.resPower();
}
}
