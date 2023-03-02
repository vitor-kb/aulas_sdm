package aula_01_03;

import java.util.Scanner;

public class Aula_01_03 {

    public static void main(String[] args) {
        //EX 1
        /*Faça um algoritmo para corrigir provas. Você deve ter um vetor de
        5 caracteres, que é o gabarito da prova. O gabarito é lido de uma única
        vez.
        */
        
        /*Peça ao usuário para informar as respostas de um aluno, e corrija as
        respostas e dê nota, considere que cada questão vale 2 pontos*/
        
        Scanner entrada = new Scanner(System.in);
        
        String vetor[] = {"A", "B", "C", "D", "E"};
        
        System.out.println("Gabarito");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }
        
        System.out.println("Digite a quantidade de acertos:");
        int nota = entrada.nextInt();
        
        if(nota == 2){
            System.out.println("Sua nota e: " + vetor[4]);  
        }
        if(nota == 4){
            System.out.println("Sua nota e: " + vetor[3]); 
        }
        if(nota == 6){
            System.out.println("Sua nota é: " + vetor[2]);  
        }
        if(nota == 8){
            System.out.println("Sua nota e: " + vetor[1]);  
        }
        if(nota == 10){
            System.out.println("Sua nota e: " + vetor[0]);  
        }
        entrada.close();
        
        
        /*Scanner sc = new Scanner(System.in);
        
        char[] gabarito = new char[5];
        
        System.out.println("Digite o gabarito da prova");
        for (int i = 0; i < 5; i++) {
            gabarito[i] = sc.nextLine().charAt(0);
        }
        
        char[] notas = new char[5];
        System.out.println("Informe a nota de um aluno: ");
        for (int i = 0; i < 5; i++) {
            notas[i] = sc.nextLine().charAt(0);
        }
        
        double notaProva = 0;
        for (int i = 0; i < 5; i++) {
            if (notas[i] == gabarito[i]) {
                notaProva = notaProva + 2;
            }
        }
        
        System.out.println("Nota: " + notaProva);
        sc.close();
        */
        
        //EX 2
        /*Faça um algoritmo que leia as médias N1 e N2 de 15 alunos diferentes
        (como double), armazenando-a em dois vetores distintos.
        
        Calcule a média de todos os alunos, armazenando-a em outro vetor e
        armazenando-as em outro vetor e imprimindo-as na tela:
        Media = 0.4 x N1 x + 0.6 x N2
        
        Após imprimir todas as notas, imprima apenas aquelas que forem menores ou
        iguais a 5.
        */
        
        Scanner sc = new Scanner(System.in);
        
        double[] notas = new double[15];
        
        System.out.println("Digite as notas dos alunos: ");
        for (int i = 0; i < 5; i++) {
            notas[i] = sc.nextLine().charAt(0);
        }
        
    }
    
}
