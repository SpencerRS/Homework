/**
 * Created by SpizzyRich on 8/12/16.
 */
public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){p("Eat!");}

    public void move(){p("Move!");}

    public void p(String stuff){
        System.out.println(stuff);
    }
}