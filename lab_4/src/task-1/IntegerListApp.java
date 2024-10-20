import java.util.*;

public class IntegerListApp {

    private ArrayList<Integer> numbers;

     public IntegerListApp() {
        numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(5) + 1);
        }
    } 

    public IntegerListApp(ArrayList<Integer> numbers) {
        this.numbers = new ArrayList<>();
        for(int number : numbers){
            this.numbers.add(number);
        }
    } 

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public boolean checkForReplace(int startIndex, int endIndex, int size) {
        if (startIndex >= 0 || endIndex < size || startIndex < endIndex || (endIndex - startIndex) < numbers.size()) {
            return true;
        }
        return false;
    }

    public void replaceNumbers(int startIndex, int endIndex, ArrayList<Integer> newNumbers){
        for( int i = startIndex; i <= endIndex; i++ ){
            numbers.set(i, newNumbers.get(i));
        }
    }

    public void sort(){
        numbers.sort(Comparator.naturalOrder());
    }

    public void sortReverse(){
        numbers.sort(Comparator.reverseOrder());
    }

    public ArrayList<Pair> getElementFrequencies() {
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers); 
        ArrayList<Pair> frequencyList = new ArrayList<>(); 
    
        for (Integer number : uniqueNumbers) {
            int count = Collections.frequency(numbers, number); 
            Pair numberFrequency = new Pair(number, count); 
            frequencyList.add(numberFrequency);
        }
        return frequencyList;
    }

}
