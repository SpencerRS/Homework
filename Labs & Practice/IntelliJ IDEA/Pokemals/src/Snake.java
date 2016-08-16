/**
 * Created by SpizzyRich on 8/12/16.
 */
public class Snake extends Reptile{
    private boolean isVenemous;

    public Snake(String name, int brain, int body, int size, int weight, boolean scales, boolean liveBirth, boolean isVenemous) {
        super(name, brain, body, size, weight, scales, liveBirth);
        this.isVenemous = isVenemous;
    }
}
