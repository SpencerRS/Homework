/**
 * Created by SpizzyRich on 8/12/16.
 */
public class Dog extends Mammal {

    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    private Toy ball;
    private Snake pet;

    public Dog(String name, int brain, int body, int size, int weight, boolean whiskers, int eyes, int mammaryGlands, int legs, int tail, int teeth, String coat, Toy ball, Snake pet) {
        super(name, brain, body, size, weight, whiskers, eyes, mammaryGlands);
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
        this.ball = ball;
        this.pet = pet;
    }

}

    public void bark(){p("Woof, mutha fucka!");}
    public void run(){p("Zoom, bitch!");}
//    run can be influenced by move as well.
//    @Override
//    public void move(){
//        super.move();
//    }
}
