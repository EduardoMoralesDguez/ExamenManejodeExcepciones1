package GeometricObject;

public class Rectangle extends GeometricObject {
    private double height;
    private double width;

    public Rectangle() {
        super();
        this.height = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }
    
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void printRectangle() {
        System.out.println("El rectángulo fue creado: " + getDateCreated() + "\n El color es: "+ getColor() 
            + "\n Está relleno:"+ isFilled() + "\n La altura es: " + height + "\n El ancho es: " + width);
    }
}
