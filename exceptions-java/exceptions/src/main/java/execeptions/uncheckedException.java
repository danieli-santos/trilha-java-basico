package execeptions;

import javax.swing.JOptionPane;

public class uncheckedException {

    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: "); 
        
        int resutado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: "+ resultado);
    }
    public static int dividir(int a, int b) {
        return a/b;
    }
}
