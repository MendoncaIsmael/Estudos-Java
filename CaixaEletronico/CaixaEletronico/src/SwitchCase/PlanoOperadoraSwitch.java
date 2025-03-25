package SwitchCase;

public class PlanoOperadoraSwitch{
    public static void main(String[] args) {
        String plano="B";

        switch(plano){
            case "T":{
                System.out.println("5 GB de Youtube");
            }
            case "M":{
                System.out.println("whatsApp e Instagram ilimitados");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
}}
