package br.edu.ifsp.list02;

import java.util.Scanner;

/*
    Você está de volta em seu hotel na Tailândia depois de um dia de mergulhos. O seu quarto tem duas lâmpadas, chamadas
    de A e B. No hotel há dois interruptores, que chamaremos de C1 e C2. Ao apertar C1, a lâmpada A acende se estiver
    apagada, e apaga se estiver acesa. Se apertar C2, cada uma das lâmpadas A e a B troca de estado: se estiver apagada,
    fica acesa e se estiver acesa apaga.

    Você chegou no hotel e encontrou as lâmpadas em um determinado estado, como foram deixadas por seu amigo. Vamos chamar
    o estado inicial da lâmpada A de IA e o estado inicial da lâmpada B de IB. Você gostaria de deixar as lâmpadas em uma
    certa configuração final, que chamaremos de FA e FB, respectivamente, apertando os interruptores a menor quantidade de
    vezes possível. Por exemplo, se as duas lâmpadas começam apagadas, e você quer que apenas a lâmpada A termine acesa,
    basta apertar o interruptor C1.

    Faça um programa que leia os estados iniciais IA e IB e os estados finais desejados FA e FB das duas lâmpadas.
    Os valores de IA, IB, FA e FB são lidos na mesma linha nessa ordem. Seus valores possíveis são 0, se a lâmpada estiver
    apagada e 1 caso contrário. Ao final, seu programa deverá imprimir o número mínimo de interruptores que devem ser
    apertados.

    Exemplos de entrada e saída:
    Entrada	| Saída
    0 0 1 1	| 1
    0 0 0 1	| 2
    Fonte: Adaptado de Olimpíada Brasileira de Informática (OBI)

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex04 {
    public static void main(String[] args) {
        final int[] array = new int[4];
         final Scanner input = new Scanner(System.in);
         for(int i =0; i<4;i++){
             array[i] = input.nextInt();
         };
        Ex04 ex04 = new Ex04();
        IO.println(ex04.compute(array[0],array[1],array[2],array[3]));
    }

    int compute(int ia, int ib, int fa, int fb) {
        int output = 0;
        int temp_ia = ia;
        int temp_ib = ib;
        while(temp_ia!=fa || temp_ib!=fb) {
            if (temp_ib != fb) {
                if (temp_ia == 0) {
                    temp_ia = 1;
                }
                else if (temp_ia == 1) {
                    temp_ia = 0;
                }
                if (temp_ib == 0) {
                    temp_ib = 1;
                }
                else if (temp_ib == 1) {
                    temp_ib = 0;
                }
                output ++;
            }

            if(temp_ia!=fa){
                if (temp_ia == 0) {
                    temp_ia = 1;
                }
                else if (temp_ia == 1) {
                    temp_ia = 0;
                }
                output++;
            }
        }
        return output;
    }
}
