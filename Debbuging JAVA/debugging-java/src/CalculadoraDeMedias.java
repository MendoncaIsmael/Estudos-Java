// Package: src
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] alunos={"Lucas","João","Maria","Ana"};
        
        double media = calculaMediaDaTurma(alunos, sc);
        
        System.out.printf("A média da turma: %.1f ", media);
    }
    static double calculaMediaDaTurma(String[] alunos, Scanner sc){
        double soma=0;
        for(String aluno:alunos){
            System.out.printf("Nota do aluno %s:", aluno);
            double nota = sc.nextDouble();
            soma += nota;
        }
    
    return soma / alunos.length;
        
    }}
    

