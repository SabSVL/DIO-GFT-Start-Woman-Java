package MaiorMenor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int maior, media = 0, cont=0, aux;

        System.out.println("Digite um numero:");
        maior = ler.nextInt();
        aux = maior;
        media = maior;
        do {

            cont++;
            System.out.println("Digite um numero:");
            maior = ler.nextInt();
            media += maior;
            if (maior > aux) aux = maior;

        }while(cont <4);
        media = media / 5;
        System.out.println("maior: " + aux + "\nmedia: " + media);
    }
}
