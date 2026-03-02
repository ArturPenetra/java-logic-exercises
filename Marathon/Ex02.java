package br.edu.ifsp.Marathon;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String risada = sc.nextLine();
        String temp1 = "";
        String temp2 = "";
        char[] chars = risada.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e'  || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                temp1 += chars[i];
            }
        }
        for (int i = chars.length-1; i >=0; i--) {
            if (chars[i] == 'a' || chars[i] == 'e'  || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                temp2 += chars[i];
            }
        }
        if(temp1.equals(temp2)&& !(temp1.isEmpty())){
            System.out.print("S");
        }
        else {
            System.out.print("N");
        }
    }
}
