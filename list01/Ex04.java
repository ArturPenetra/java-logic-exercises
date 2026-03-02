package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C.
    A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis.
    Quantos chocolates Osmar consegue comer? Por exemplo:

    Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate,
    fazendo com que o número total de chocolates que ele pode comer seja 6.
    Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates que Osmar pode comer.
    C e M são inteiros positivos.

    Entrada	Saída
    10      6
    2
    5
 */
public class Ex04 {

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        for(int i=0; i<3; i++){
            array[i] = scan.nextInt();
        }
        Ex04 ex04 = new Ex04();
        IO.println(ex04.compute(array[0],array[1],array[2]));
    }
                    //12            2           2
    int compute(int dinheiros, int precos, int embalagem_troca) {
        int output =  -1;
        int quant_chocolates = dinheiros/precos; //6
        int quant_embalagem = quant_chocolates; //6
        int trocas = quant_embalagem/embalagem_troca; //3
        while(quant_embalagem >= embalagem_troca){
            quant_embalagem -= (embalagem_troca-1);
            quant_chocolates++;
        }
        output = quant_chocolates;
        return output; //11
    }
}
