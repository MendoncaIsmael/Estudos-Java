package operadoresjava;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[]args){
        int a,b,c,d;
    Scanner sc=new Scanner(System.in);
    System.out.println("Digite a sua nota do 1° Bimestre:");
    a=sc.nextInt();
    
    System.out.println("Digite a sua nota do 2° Bimestre:");
    b=sc.nextInt();
    
    System.out.println("Digite a sua nota do 3° Bimestre:");
    c=sc.nextInt();
    
    System.out.println("Digite a sua nota do 4° Bimestre:");
    d=sc.nextInt();
    sc.close();

    int media=(a+b+c+d)/4;
    System.out.println("A média do aluno foi nota "+media);
    String res=media>=6?"Aprovado":"Reprovaddo";
    System.out.println("O aluno foi "+res);
    }
    
}
