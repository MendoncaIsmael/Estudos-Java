public class CepInvalidoException extends Exception{
    
    public static void main(String[] args) {
     try{
        var cepFormatado=formatarCep("23765064");
        System.out.println(cepFormatado);
     }catch(CepInvalidoException e){
         e.printStackTrace();
         System.out.println("O cep informado é inválido");
        }
    }     
      static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length()!=8)
        throw new CepInvalidoException()

        //simulando um cep formartado
        return "23.765-064";
     }
    }
