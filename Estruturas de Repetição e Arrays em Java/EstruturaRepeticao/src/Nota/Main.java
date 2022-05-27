package Nota;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota;
        System.out.println("Nota: ");
        nota = ler.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota Invalida! Digite novamente: ");
            nota = ler.nextInt();

        }
    }
}
