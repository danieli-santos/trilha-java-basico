package loops;

import java.util.Scanner;

import org.omg.CORBA.DynAny;

public class NomeIdade {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int idade;
        String nome;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0") )break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
            
        }
        System.out.println("Terminou!");
    }
    
}