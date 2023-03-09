package loops;

import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int mutiplicacao = 1;

        System.out.print(fatorial + "!");
        for (int i = fatorial; i >= 1; i--) {
            mutiplicacao = mutiplicacao * i;
            
        }
        System.out.println(mutiplicacao);

        
    }
    
}
