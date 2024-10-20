import java.util.*;

public class  DecimalToHex{

    public ArrayList<Pair> DecimalToHexConverter(int max, int min, int step) {

        ArrayList<Pair> DecimalAndHex = new ArrayList<Pair>();
        for(int i = min; i <= max; i += step){
            Pair numberPair = new Pair (i, Integer.toHexString(i).toUpperCase());
            DecimalAndHex.add(numberPair);
        }
        return DecimalAndHex;

    }  

}