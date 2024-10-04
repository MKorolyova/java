import java.util.ArrayList;
import java.util.HashSet;

public class PrintUnique {
    public static HashSet<Integer> main(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<Integer>(list);
        System.out.println(set);
        return set;
    }

}
