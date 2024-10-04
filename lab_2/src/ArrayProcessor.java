import java.util.ArrayList;
import java.util.Collections;

public class ArrayProcessor {

    public static ArrayList<Integer> start(int[] arg){
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for( int i =0; i < arg.length; i++){
            if ((arg[i]%2) == 0 ){
                odd.add(arg[i]);
            }
        }
        Collections.sort(odd);

        ArrayList<Integer> even = new ArrayList<Integer>();
         for( int i =0; i < arg.length; i++){
            if ((arg[i] % 2) != 0 ){
                even.add(arg[i]);
            }
        }
        Collections.sort(even, Collections.reverseOrder());

        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.addAll(odd);
        answer.addAll(even);
        
        return answer;
    }
}
