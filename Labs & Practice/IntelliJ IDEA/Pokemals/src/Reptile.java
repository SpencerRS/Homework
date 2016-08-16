/**
 * Created by SpizzyRich on 8/12/16.
 */
public class Reptile extends Animal {
    private boolean scales = true;
    private boolean liveBirth = false;

    public Reptile(String name, int brain, int body, int size, int weight, boolean scales, boolean liveBirth) {
        super(name, brain, body, size, weight);
        this.scales = scales;
        this.liveBirth = liveBirth;
    }
}
