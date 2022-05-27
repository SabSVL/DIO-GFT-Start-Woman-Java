package Fatorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor, fat = 1;

        System.out.println("Digite um numero:");
        valor = ler.nextInt();

        for (int i = valor; i>=1;i--){
            fat *= i;
        }
        System.out.println(valor+"!: " + fat);
    }
}
