package Ex2;
import java.util.LinkedList;
import java.util.Collection;

public class MyList extends LinkedList<Integer> {
    private int totalAdaugate = 0;

    @Override
    public boolean add(Integer e) {
        totalAdaugate++;
        return super.add(e); // LinkedList permite duplicate
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        totalAdaugate += c.size();
        return super.addAll(c);
    }

    public int getTotalAdaugate() {
        return totalAdaugate;
    }
}

