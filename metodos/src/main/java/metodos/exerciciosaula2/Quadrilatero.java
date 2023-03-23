package metodos.exerciciosaula2;

public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("Area do quadadro: " + lado * lado);
        
    }
    public static void area(double lado1, double lado2) {
        System.out.println("Area do retângulo: " + lado1 * lado2);
         
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Area do trapezio: " + ((baseMaior+baseMenor) + altura));
        
    }    
    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Area do losando: " + (diagonal1 * diagonal2)/2 );
        
    }
    
}
