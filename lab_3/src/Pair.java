public class Pair {
    int first;
    String second;

    public Pair(int first, String second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%d\t\t\t%s\n", first, second);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Pair pair = (Pair) obj;
        return first == pair.first && second.equals(pair.second);
    }

}


