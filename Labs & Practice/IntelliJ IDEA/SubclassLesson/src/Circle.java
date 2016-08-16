/**
 * Created by SpizzyRich on 8/12/16.
 */
public class Circle extends Shape{
    float radius;

    public Circle(String mrColor, float radius) {
        super(mrColor);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public double calcArea(){
        return Math.PI *Math.pow(radius,2);
    }
}
