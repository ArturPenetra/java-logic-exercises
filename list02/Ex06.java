package br.edu.ifsp.list02;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
    Faça um programa que leia um valor inteiro N. Após isso, leia dois vetores A e B de tamanho N. Em seguida, o programa
    deve criar um vetor C com os elementos de A e B intercalados.

    Exemplos de entrada e saída:

    | Entrada                 | Saída                         |
    | -------                 | ------                        |
    | 6                       | 5 10 6 20 3 30 8 40 2 50 0 60 |
    | 5 6 3 8 2 0             |                               |
    | 10 20 30 40 50 60       |                               |
      ---
    | 3                       | 1 1 2 1 3 1                   |
    | 1 2 3                   |                               |
    | 1 1 1                   |                               |

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex06 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        final int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        Ex06 ex06 = new Ex06();
        IO.println(ex06.compute(A, B));
    }

    String compute(int[] arrayA, int[] arrayB) {
        String output = null;
        int[] temp = new int[arrayA.length + arrayB.length];
        for  (int i = 0; i < temp.length; i+=2) {
            temp[i] = arrayA[i/2];
            temp[i+1] = arrayB[i/2];
        }     /*faz passar por cada elemento do array (.stream),
                em seguida transforma cada um desses números passe a ser um objeto (.mapToObj) do tipo string (String::valueOf),
                transforma tudo em um valor unico (.collect), com o delimitador escolhido (Collectors.joining())
              */
        output = Arrays.stream(temp).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        return output;
    }
}
