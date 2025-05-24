package Ex2;
import java.util.HashSet;
import java.util.Collection;

public class
MySet extends HashSet<Integer> {
    private int totalAdaugate = 0;

    @Override
    public boolean add(Integer e) {
        boolean adaugat = super.add(e);
        if (adaugat) totalAdaugate++;
        return adaugat;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean modificat = false;
        for (Integer elem : c) {
            modificat |= this.add(elem); // folosim add suprascris
        }
        return modificat;
    }

    public int getTotalAdaugate() {
        return totalAdaugate;
    }
}

