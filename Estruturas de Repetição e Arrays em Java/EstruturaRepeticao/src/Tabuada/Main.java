package Tabuada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor;
        do {
            System.out.println("Digite um numero:");
            valor = ler.nextInt();
        }while(valor<1 || valor>10);

        System.out.println("Tabuada do " +valor +":");
        for(int i = 1; i<=10;i++){
            System.out.println(valor + " x " + i + " = " +valor*i);
        }
    }
}
