import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class RepeatedElements {

    public static HashSet<Integer> main(ArrayList<Integer> arg){
        HashSet<Integer> repeated = new HashSet<Integer>();
        for(int i : arg){
            if (Collections.frequency(arg, i)>1){
                repeated.add(i);
            }
        }
        return repeated;
    }
}
