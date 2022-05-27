package ImparPar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor, quantidade, par=0, impar=0;
        System.out.println("Digite a quantidade de numeros:");
         quantidade = ler.nextInt();

        do {

            System.out.println("Digite um numero:");
            valor = ler.nextInt();

            if(valor%2==0) par++;
            else impar++;

            quantidade--;

        }while (quantidade>0);
        System.out.println("Par: " + par + "\nImpar: " +impar);
    }
}
