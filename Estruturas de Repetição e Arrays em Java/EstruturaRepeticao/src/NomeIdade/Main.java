package NomeIdade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {

            System.out.println("Digte seu nome: ");
            nome = ler.next();

            if(nome.equals("0")) break;
            System.out.println("Digite sua idade: ");
            idade = ler.nextInt();


        }
    }

}
