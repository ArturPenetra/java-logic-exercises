package br.edu.ifsp.list01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
    Um motorista de Uber estipula o preço de uma determinada viagem dada a quantidade de quilômetros percorrida.
    Para viagens de até X km, é cobrado um valor R$ V1 por km. Acima de X km, é cobrado o valor R$ V2.
    Faça um programa que leia X, V1, V2 e a quantidade de quilômetros A da viagem e imprima o valor total
    com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada    	Saída
    100         75.00
    1.50
    1.25
    50
    Entrada    	Saída
    100         187.50
    1.50
    1.25
    150
*/
public class Ex07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int input = scanner.nextInt();
        double[] array = new double[3];
        for(int i = 0; i<3; i++){
            array[i] = scanner.nextDouble();
        }
        Ex07 ex07 = new Ex07();
        IO.println(ex07.compute(input, array[0], array[1],array[2]));
    }

    double compute(int x, double v1, double v2, double a) {
        double output = -0.1;
        if (a <= x){
            output = v1*a;
        }
        else {
            output = v2*a;
        }
        return output;
    }
}
