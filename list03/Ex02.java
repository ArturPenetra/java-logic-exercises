package br.edu.ifsp.list03;

import java.util.Scanner;

/*
Faça um programa que, dada uma String, encontra a primeira e a última substrings de tamanho K de acordo com a ordem
alfabética. Por exemplo, para a String “welcometojava” e K = 3; A substring “ava” é a primeira substring de tamanho
3 e “wel” é a última, considerando a ordem alfabética (saída: "ava wel"). Para dados de entrada inválidos, o programa
deverá imprimir uma String vazia.
 */
public class Ex02 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int K =  scanner.nextInt();
        String palavra = scanner.nextLine();
        Ex02 ex02 = new Ex02();
        IO.println(ex02.compute(palavra, K));
    }

    String compute(String word, int number) {
        String output = null;
        if(word == null || word.length() < number || number <= 0){
            output = null;
        }
        else{
            StringBuilder temp = new StringBuilder();
            String[] array = word.split("");
            String char_maior = "";
            String char_menor = "";
            int maior = 0;
            int ult_maior = 0;
            String teste = "e";
            int teste1 = teste.compareTo("c");
            int ult_menor = 0;
            int menor = 0;
            for(int i = 0; i < word.length(); i++){
                if(ult_maior!=0) {
                    if (array[i].compareToIgnoreCase(char_maior) >= ult_maior && i <= number) {
                        ult_maior = maior;
                        maior = i;
                        char_maior = array[i];
                    }
                }
                else{
                    ult_maior = i;
                    maior = i;
                    char_maior = array[i];
                }
                if(ult_menor!=0) {
                    if (array[i].compareToIgnoreCase(char_menor) <= ult_menor && i <= number) {
                        ult_menor = menor;
                        menor = i;
                        char_menor = array[i];
                    }
                }
                else{
                    ult_menor = i;
                    menor = i;
                    char_menor = array[i];
                }
            }
            if(word.length() == number){
                maior = 0;
                menor = 0;
            }
            temp.append(word.substring(maior, maior+number));
            temp.append(" ");
            temp.append(word.substring(menor, menor+number));
            output = temp.toString();
        }
        return output;
    }
}
