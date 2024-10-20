import java.util.*;

public class QueueApp {
    LinkedList<QueuePerson> queue;
    public QueueApp(){
        queue = new LinkedList<QueuePerson>();
    }

    public LinkedList<QueuePerson> getQueue() {
        return queue;
    }

    public QueueApp(ArrayList<QueuePerson> people){
        queue = new LinkedList<QueuePerson>();
        for(QueuePerson person : people){
            this.add(person);
        }
    }

    public void add(QueuePerson person){
        int index = 0;
        while(index < queue.size() && person.getPriority() >= queue.get(index).getPriority()){
            index++;
        }
        queue.add(index, person);
    }

     public HashMap<Integer, Integer> countByPriority() {
        HashMap<Integer, Integer> priorityCounts = new HashMap<>();
        for (QueuePerson person : queue) {
            priorityCounts.put(person.getPriority(), 
                priorityCounts.getOrDefault(person.getPriority(), 0) + 1);
        }
        return priorityCounts;
    }
    
}
