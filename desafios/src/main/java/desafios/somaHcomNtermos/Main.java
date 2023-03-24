package desafios.somaHcomNtermos;

import java.util.Scanner;

public class Main {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        double h = 0;
        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h += (double) 1/i;
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.printf("%.0f", h);

    }
}


