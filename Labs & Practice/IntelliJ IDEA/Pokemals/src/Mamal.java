/**
 * Created by SpizzyRich on 8/12/16.
 */
public class Mammal extends Animal{
    private boolean whiskers = true;
    private int eyes;
    private int mammaryGlands;

    @Override
    public void eat() {super.eat();}
    @Override
    public void move() {super.move();}
    @Override
    public void p(String stuff) {super.p(stuff);}

    public Mamal(String name, int brain, int body, int size, int weight, boolean whiskers, int eyes, int mammaryGlands) {
        super(name, brain, body, size, weight);
        this.whiskers = whiskers;
        this.eyes = eyes;
        this.mammaryGlands = mammaryGlands;

    }
}
