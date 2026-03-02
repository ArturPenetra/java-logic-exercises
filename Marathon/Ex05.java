package br.edu.ifsp.Marathon;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nc = new int[2];
        for(int i = 0; i<2; i++){
            nc[i] = sc.nextInt();
        }
        int[] array = new int[nc[0]];
        for(int i = 0; i<nc[0]; i++){
            array[i] = sc.nextInt();
        }
        int comAcao = -array[0]-nc[1];
        int semAcao = 0;
        for(int i = 0; i<nc[0]; i++){
            semAcao = Math.max(semAcao, comAcao + array[i]);
            comAcao = Math.max(comAcao, semAcao - array[i] - nc[1]);
        }
        System.out.print(semAcao);
    }
}
