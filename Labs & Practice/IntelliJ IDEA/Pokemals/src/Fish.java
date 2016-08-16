/**
 * Created by SpizzyRich on 8/12/16.
 */
public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void moveBackFin(){p("Swish, bitch!");}
    public void swim(){p("Splash, hoe!");}
}