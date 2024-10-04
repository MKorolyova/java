import java.util.ArrayList;
import java.util.HashSet;


public class UniquenessChecker {

    public static boolean main(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        return set.size() == list.size();
    }
}
