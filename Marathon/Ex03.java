package br.edu.ifsp.Marathon;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nm = new int[2];
        nm[0] = sc.nextInt();
        nm[1] = sc.nextInt();
        int maior = 0;
        int soma = 0;
        int[][] matriz = new int[nm[0]][nm[1]];
        for (int i = 0; i < nm[0]; i++) {
            soma = 0;
            for (int j = 0; j < nm[1]; j++) {
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
            if(soma > maior){
                maior = soma;
            }
        }
        for (int i = 0; i < nm[1]; i++) {
            soma = 0;
            for (int j = 0; j < nm[0]; j++) {
                soma += matriz[j][i];
            }
            if(soma > maior){
                maior = soma;
            }
        }
        System.out.println(maior);
    }
}
