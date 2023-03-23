package metodos.exerciciosaula3;

public class Main {
    public static void main(String[] args) {

        //Retornos
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quandrado: " + areaQuadrado);

        double areaRetangolo = Quadrilatero.area(5d, 5);
        System.out.println("Area do Retangolo: " + areaRetangolo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9); 
        System.out.println("Area do Trapezio: " + areaTrapezio);

        float areaLosango = Quadrilatero.area(5,5);  
        System.out.println("Area do Losango: " + areaLosango);

    }
    
}
