/**
 * Created by SpizzyRich on 8/12/16.
 */
public class Cat extends Animal{
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    private  int claws;

    public Cat(String name, int brain, int body, int size, int weight, int legs, int tail, int teeth, String coat, int claws) {
        super(name, brain, body, size, weight);
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
        this.claws = claws;
    }

}
    public void meow(){
        System.out.println("Meow");
    }
}
