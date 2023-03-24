package desafios.imprimindopositivoemedia;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        //double valorePositivos = 0;
        double[] numeros = {2,-2, 3, -5, 7, 9};
        //double numeros;// = leitor.nextDouble();

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:

        for (int i = 0; i < numeros.length; i++) {
            //System.out.println("numeros: ");
            //numeros = leitor.nextDouble();
            if (numeros[i] > 0) {
                cont++;
                media += numeros[i];
            }
        }
        media = media /= cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
        }


    }
//Como foi resolvido na DIO

//public class DIO {
//
//    public static void main(String[] args) throws IOException {
//        Scanner leitor = new Scanner(System.in);
//        int cont = 0;
//        double media = 0;
//        int tamanho = 6;
//        double[] numeros = new double[tamanho];
//
//        //TODO: Implemente as condições adequadas para obter a quantidade
//        //de valores positivos e a média dos valores positivos:
//
//        for (int i = 0; i < tamanho; i++) {
//            numeros[i] = leitor.nextDouble();
//            // //numeros = leitor.nextDouble();
//            if (numeros[i] > 0) {
//                cont++;
//                media += numeros[i];
//            }
//        }
//
//        media = media /=cont;
//        System.out.println(cont + " valores positivos");
//        System.out.println(String.format("%.1f", media));
//    }

    // media = media + cont/cont;
    // System.out.println(cont + " valores positivos");
    // System.out.println(String.format("%.1f", media));
//}


