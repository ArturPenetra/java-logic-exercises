package br.edu.ifsp.Marathon;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L =  sc.nextInt();
        int c =  sc.nextInt();
        int a =  sc.nextInt();
        int b =  sc.nextInt();
        int[][] matriz = new int[L][c];
        for(int i = 0; i < L; i++){
            for(int j = 0; j < c; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        int indexL = a-1;
        int indexC = b-1;
        while(true){
            matriz[indexL][indexC] = 0;
            if(indexL+1<L && matriz[indexL+1][indexC] == 1){
                indexL++;
            }
            else if (indexC+1<c && matriz[indexL][indexC+1] == 1){
                indexC++;
            }
            else if (indexL-1>=0 && matriz[indexL-1][indexC] == 1){
                indexL--;
            }
            else if (indexC-1>=0 && matriz[indexL][indexC-1] == 1){
                indexC--;
            }
            else{
                break;
            }
        }
        String resultado = (indexL+1) + " " + (1+indexC);
        System.out.println(resultado);
    }
}
