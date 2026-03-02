package br.edu.ifsp.list02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
    Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int[] firstFive = new int[10];
        for(int i=0; i<5; i++){
            firstFive[i] = scanner.nextInt();
        }
        int[] otherInts = new int[10];
        int cont = 0;
        while(true){
            int ler = scanner.nextInt();
            if(ler < 0){
                break;
            }
            if(cont == otherInts.length){
                otherInts = Arrays.copyOf(otherInts, otherInts.length*2);
            }
            otherInts[cont] = ler;
            cont++;
        }
        otherInts = Arrays.copyOf(otherInts, cont);
        Ex03 ex03 = new Ex03();
        IO.println(ex03.compute(firstFive, otherInts));
    }

    String compute(int[] firstFive, int[] otherInts) {
        String output = "";
        if(otherInts.length == 0){
            output = "Erro";
        }
        else {
            int cont = 5;
            boolean flag = true;
            output += Arrays.stream(firstFive).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n";
            for (int i = 0; i < otherInts.length; i++) {
                flag = true;
                for (int j = 0; j < cont; j++) {
                    if (firstFive[j] == otherInts[i]) {
                        for (int k = j; k < cont - 1; k++) {
                            firstFive[k] = firstFive[k + 1];
                        }
                        firstFive[cont-1] = 0;
                        firstFive = Arrays.copyOf(firstFive, firstFive.length - 1);
                        if(cont>=0) {
                            cont--;
                        }
                        flag = false;
                        if(cont<=0){
                            break;
                        }
                        output += Arrays.stream(firstFive).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n";
                    }
                }
                if (flag && cont <= 10) {
                    firstFive = Arrays.copyOf(firstFive, firstFive.length + 1);
                    firstFive[cont] = otherInts[i];
                    cont++;
                    output += Arrays.stream(firstFive).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n";
                }

            }
        }
        return output.trim();
    }
}
