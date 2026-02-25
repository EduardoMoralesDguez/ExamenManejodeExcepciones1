package GeometricObject;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1, side2, side3;
        String color;
        boolean filled;

        System.out.println("Ingrese el lado 1 del triángulo:");
        side1 = sc.nextDouble();
        System.out.println("Ingrese el lado 2 del triángulo:");
        side2 = sc.nextDouble();
        System.out.println("Ingrese el lado 3 del triángulo:");
        side3 = sc.nextDouble();
        System.out.println("Ingrese el color del triángulo:");
        color = sc.next();
        System.out.println("¿Está relleno el triángulo? (true/false):");
        filled = sc.nextBoolean();

        try {
            Triangle t = new Triangle(side1, side2, side3, color, filled);
            System.out.println(t.toString());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}
