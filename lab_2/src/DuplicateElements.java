import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;



public class DuplicateElements {

    public static  HashMap<Integer, ArrayList<Integer>> start(int[] array) {

        HashMap<Integer, ArrayList<Integer>> elementIndices = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (!elementIndices.containsKey(value)) {
                elementIndices.put(value, new ArrayList<Integer>());
            }

            elementIndices.get(value).add(i);  
        }


        Iterator<Integer> iterator = elementIndices.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            if (elementIndices.get(key).size() == 1) {
                iterator.remove();
            }
        }

        return elementIndices;
    }
}