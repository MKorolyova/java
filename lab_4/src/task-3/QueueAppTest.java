import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class QueueAppTest {
    @Test
        public void addChecker() {
            LinkedList<QueuePerson> expected = new LinkedList<>();
            expected.add(new QueuePerson("Smith", "John", "Michael", new AddressValue("New York", "Broadway", "123", 45), 1));
            expected.add(new QueuePerson("Johnson", "Emily", "Grace", new AddressValue("San Francisco", "Market St", "22", 8), 1));
            expected.add(new QueuePerson("Doe", "Jane", "Elizabeth", new AddressValue("Chicago", "Lake Shore Dr", "55", 0), 2));
            expected.add(new QueuePerson("Davis", "Sophia", "Ann", new AddressValue("Boston", "Boylston St", "18", 0), 2));
            expected.add(new QueuePerson("Li", "Kate", "Una", new AddressValue("Austin", "Santa Barbara loop", "27", 0), 2));
            expected.add(new QueuePerson("Brown", "James", "Robert", new AddressValue("Seattle", "Pine St", "30", 12), 3));

            ArrayList<QueuePerson> input = new ArrayList<>();
            input.add(new QueuePerson("Smith", "John", "Michael", new AddressValue("New York", "Broadway", "123", 45), 1));
            input.add(new QueuePerson("Doe", "Jane", "Elizabeth", new AddressValue("Chicago", "Lake Shore Dr", "55", 0), 2));
            input.add(new QueuePerson("Johnson", "Emily", "Grace", new AddressValue("San Francisco", "Market St", "22", 8), 1));
            input.add(new QueuePerson("Brown", "James", "Robert", new AddressValue("Seattle", "Pine St", "30", 12), 3));
            input.add(new QueuePerson("Davis", "Sophia", "Ann", new AddressValue("Boston", "Boylston St", "18", 0), 2));

        QueueApp test = new QueueApp(input);
        test.add(new QueuePerson("Li", "Kate", "Una", new AddressValue("Austin", "Santa Barbara loop", "27", 0), 2));
        LinkedList<QueuePerson> answer = test.getQueue();
        assertEquals(expected, answer);
    }


    @Test
    public void countByPriorityChecker() {
        HashMap<Integer, Integer> expected = new HashMap<Integer, Integer>();
        expected.put(1, 2);
        expected.put(2,2);
        expected.put(3,1);
        
        ArrayList<QueuePerson> input = new ArrayList<>();
        input.add(new QueuePerson("Smith", "John", "Michael", new AddressValue("New York", "Broadway", "123", 45), 1));
        input.add(new QueuePerson("Doe", "Jane", "Elizabeth", new AddressValue("Chicago", "Lake Shore Dr", "55", 0), 2));
        input.add(new QueuePerson("Johnson", "Emily", "Grace", new AddressValue("San Francisco", "Market St", "22", 8), 1));
        input.add(new QueuePerson("Brown", "James", "Robert", new AddressValue("Seattle", "Pine St", "30", 12), 3));
        input.add(new QueuePerson("Davis", "Sophia", "Ann", new AddressValue("Boston", "Boylston St", "18", 0), 2));

    QueueApp test = new QueueApp(input);
    HashMap<Integer, Integer> answer = test.countByPriority();
    assertEquals(expected, answer);
}

}
