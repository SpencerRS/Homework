/**
 * Created by SpizzyRich on 8/22/16.
 */
public class Kata {

    public static String getMiddle(String word) {
        int length = word.length();
        boolean even;
        String middle;
        if (length % 2 == 0) {
            even = true;}
        else {
            even = false;
        }
        if (even == false){
           middle = word.substring((length/2),(length/2)+1);
        }else{
            middle = word.substring((length/2)-1, (length/2)+1);
        }
        return middle;
    }
}
