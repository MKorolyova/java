import java.util.ArrayList;
import java.util.HashSet;

public class PrintUnique {
    public static HashSet<Integer> start(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<Integer>(list);
        System.out.println(set);
        return set;
    }

}
