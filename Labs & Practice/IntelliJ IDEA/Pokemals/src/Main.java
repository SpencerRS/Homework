/**
 * Created by SpizzyRich on 8/12/16.
 */
public class Main {

    public static void main(String[] args) {
        Toy ball = new Toy("bla","bally");
        Snake snape= new Snake("Snape", 1,2,2,2,true,false,true);
        Dog dog = new Dog("Buck",1,2,3,3,true,2,6,4,1,20,"black",Toy);
        dog.eat();
        dog.bark();
        dog.run();
        Fish fish = new Fish("Bubbles",0,1,1,1,2,2,4);
        fish.eat();
        fish.moveBackFin();
        fish.move();
        fish.swim();
    }
}
