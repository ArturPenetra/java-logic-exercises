package br.edu.ifsp.list02;

import java.util.Scanner;

/*
    Todos os Natais o Papai Noel se prepara para embarcar em seu trenó todos os N presentes a serem entregues.
    A área em que os presentes ficam no trenó pode ser dividida em dois lados: o lado A e o lado B. Para que o trenó
    fique equilibrado, a diferença da soma dos pesos dos presentes que estão no lado A e no lado B não pode ser maior
    que 5kg.

    Você recebeu a tarefa de ajudar o Papai Noel este ano. Dados N presentes, você deve descobrir se existe uma
    maneira de dividi-los nos lados A e B, de tal forma que o trenó nunca fique desequilibrado.

    Faça um programa que leia o número de presentes N que o Papai Noel deve entregar. Após isso, leia N números
    inteiros P, representando o peso de cada presente. Os presentes devem ser alocados um por vez, na ordem em que
    são lidos, e em nenhum momento o trenó deve ficar desequilibrado. Seu programa deve imprimir "S" se for possível
    equilibrar todos os presentes no trenó e "N" caso contrário.

    Exemplos de entrada e saída:

    | Entrada      | Saída  |
    | -------      | ------ |
    | 3            | S      |
    | 4 6 2        | S      |
    | -------      | ------ |
    | 2            | N      |
    | 6 6          |        |


    Fonte: Adaptado de https://neps.academy/problem/436
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex08 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        final int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = input.nextInt();
        }
        Ex08 ex08 = new Ex08();
        IO.println(ex08.compute(array));
    }

    String compute(int[] giftsWeights) {
        String output = null;
        int ladoA = 0;
        int ladoB = 0;
        for (int i = 0; i < giftsWeights.length; i++) {
            if(ladoA+giftsWeights[i]<=ladoB+5){
                ladoA+=giftsWeights[i];
            }
            else{
                ladoB+=giftsWeights[i];
            }
            if(ladoA-ladoB>5 || ladoB-ladoA>5){
                output = "N";
                break;
            }
        }
        if((ladoA-ladoB<=5 && ladoA-ladoB>=0) || (ladoB-ladoA<=5 && ladoB-ladoA>=0)){
            output = "S";
        }
        return output;
    }
}
