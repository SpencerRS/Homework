/**
 * Created by SpizzyRich on 8/2/16.
 */
public class Main {
    int mSum;
    public static void main(String[] args) {
        System.out.print(transmogrified(7,2,2));
    }

    public static double transmogrified(int num, int otherNum, int powNum){
        int toSquare = num * otherNum;
       return Math.pow(toSquare, powNum);
    }

}
