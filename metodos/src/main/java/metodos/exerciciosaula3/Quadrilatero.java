package metodos.exerciciosaula3;

public class Quadrilatero {

    public static double area(double lado) {
       return lado * lado;
        
    }
    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
         
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior+baseMenor) + altura);
        
    }    
    public static float area(float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2)/2;
        
    }
    
}