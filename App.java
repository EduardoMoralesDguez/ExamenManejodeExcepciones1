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
            System.out.println("\n--- RESULTADOS ---");
            System.out.println(t.toString());
            System.out.println("Área: " + t.getArea());
            System.out.println("Perímetro: " + t.getPerimeter());
            System.out.println("Color: " + t.getColor());
            System.out.println("¿Relleno?: " + t.isFilled());
        } catch (IllegalTriangleException e) {
            System.out.println("\nError al crear el triángulo: " + e.getMessage());
        }
        
        sc.close();
    }
}
