package br.edu.ifsp.list03;

import java.util.Scanner;

/*
Implemente um programa que gere senhas provisórias a partir do nome do usuário, seguindo o mesmo
padrão dos exemplos a seguir:

EXEMPLO 1 Entrada: Java | Saída: J*Ja*Jav*Jav*Ja*J
EXEMPLO 2 Entrada: POOS3 | Saída: P*PO*POO*POOS*POOS*POO*PO*P
EXEMPLO 3 Entrada: KO | Saída: K*K
EXEMPLO 4 Entrada: O | Saída: Invalido
EXEMPLO 5 Entrada: | Saída: Invalido
*/
public class Ex01 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String linha = sc.nextLine();
        Ex01 ex01 = new Ex01();
        IO.println(ex01.compute(linha));
    }

    String compute(String input) {
        String output = null;
        if(input == null || input.length() <= 1){ //Verificação exigida no enunciado
            output = "Invalido";
        }
        else{
            StringBuilder temp = new StringBuilder(); //Criando uma string via concatenação, em vez de ter que transformar em vetores e depois repassar para string
            for (int i = 1; i < input.length(); i++){ // indice 1 (colocando tudo entre o length 0 [nada] e 1 [começo da string]) até um a menos q o tamanho total (<length)
                if(temp.length() >0){ // Só colocará o * caso já tenha algo no StringBuilder
                    temp.append("*");
                }
                temp.append(input.substring(0, i)); // Da append em todas as letras da outra string do indice inicial (primeiro int) ao indice final (segundo int)
            }
            for(int i = input.length()-1; i >0; i--){ //Começando em um indice menor que o valor total e indo até um maior que o 0
                temp.append("*");
                temp.append(input.substring(0, i));
            }
            output = temp.toString(); //Transforma o StringBuilder para String
        }
        return output;
    }
}
