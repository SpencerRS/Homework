/**
 * Created by SpizzyRich on 8/12/16.
 */
public class Rectangle extends Shape{
    private int mrWidth;
    private int mrHeight;

    public Rectangle(String mrColor, int mrWidth, int mrHeight) {
        super(mrColor);
        this.mrWidth = mrWidth;
        this.mrHeight = mrHeight;
    }
    public int calcArea(){
        return mrHeight*mrWidth;
    }
}
