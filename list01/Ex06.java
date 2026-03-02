package br.edu.ifsp.list01;

import java.util.Locale;
import java.util.Scanner;

/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           4 20.00
    3
    5
    3

    Entrada	    Saída
    10.0        3 15.00
    2.0
    5.0
    7
*/
public class Ex06 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        double[] array = new double[4];
        for (int i = 0; i < 4; i++) {
            array[i] = scanner.nextDouble();
        }
        Ex06 ex06 = new Ex06();
        IO.println(ex06.compute(array[0],array[1],array[2],array[3]));
    }
                //  10          2       5           7
    String compute(double L, double a, double c, double m) {
        String output = null;
        double area_parede = L*a;
        int quant_latas = (int)Math.ceil(area_parede/m);
        double preco = quant_latas*c;
        output = String.format(Locale.US, "%d %.2f", quant_latas,preco);
        return output;
    }
}
