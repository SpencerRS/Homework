import java.util.stream.DoubleStream;


/**
 * Created by SpizzyRich on 8/23/16.
 */
public class Kata {
    public static void main(String[] args) {
        double[] values1 = {1,2,3,4,5};
        double[] values2 = {2,3,4,5,6};
        double test1 = getAverage(values1,5);
        double test2 = getAverage(values2,6);
    }

    public static double getAverage(double[] donations, double newAverage) {
    return ((newAverage*donations.length+1)- DoubleStream.of(donations).sum());
    }
}
