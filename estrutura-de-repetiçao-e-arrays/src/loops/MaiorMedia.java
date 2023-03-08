package loops;

import java.util.Scanner;

public class MaiorMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            
            if(numero > maior) maior = numero;

             count = count + 1;

        } while (count < 5);
        System.out.println("maior: " + maior);
        System.out.println("Media: " + (soma/5));

        

    }  
}
