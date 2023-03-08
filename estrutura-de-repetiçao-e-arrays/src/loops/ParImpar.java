package loops;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de numero: ");
        quantNumeros = scan.nextInt();
        
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de pares: " + quantPares);
        System.out.println("Quantidade impares: " + quantImpares);
    }
}
