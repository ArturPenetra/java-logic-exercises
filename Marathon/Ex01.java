package br.edu.ifsp.Marathon;

import java.util.Scanner;

class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ncm = new int[3];
        for (int i = 0; i < ncm.length; i++) {
            ncm[i] = sc.nextInt();
        }
        int cont = ncm[1];
        boolean flag = true;
        int[] marcada = new int[ncm[1]];
        for (int i = 0; i < marcada.length; i++) {
            marcada[i] = sc.nextInt();
        }
        int[] compradas = new int[ncm[2]];
        for (int i = 0; i < compradas.length; i++) {
            compradas[i] = sc.nextInt();
        }

        for(int i = 0; i < marcada.length; i++){
            flag = true;
            for(int j = 0; j < compradas.length; j++){
                if(marcada[i] == compradas[j]&&flag){
                    cont--;
                    flag = false;
                }
            }
        }
        System.out.print(cont);
    }
}
