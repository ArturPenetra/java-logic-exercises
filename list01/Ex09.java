package br.edu.ifsp.list01;

import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/
public class Ex09 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int[] array = new int[10];
        int input = scanner.nextInt();
        while (input >= 0){
            if(contador == array.length){
                array = new int[contador + 10];
            }
            array[contador] = input;
            input = scanner.nextInt();
            contador++;
        }
        Ex09 ex09 = new Ex09();
        IO.println(ex09.compute(array));
    }

    String compute(int[] input) {
        String output = null;
        double soma = 0;
        int quant_maior = 0;
        double quant_idoso = 0;
        double percent = 0;
        double media;
        for (int i = 0; i < input.length-1; i++){
            soma += input[i];
            if(input[i] >= 18){
                quant_maior++;
            }
            if(input[i] > 75){
                quant_idoso++;
            }
        }
        media = soma / (double)(input.length-1);
        percent = (quant_idoso * 100) / (input.length-1);
        output = String.format(Locale.US, "%.2f %d %.2f%%", media, quant_maior, percent);
        return output;
    }
}
