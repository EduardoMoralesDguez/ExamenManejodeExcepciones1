package GeometricObject;
import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = "White";
        this.filled = false;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Se creó en:" + dateCreated + "\nColor: " + color + " Y es relleno: " + filled;
    }

}
