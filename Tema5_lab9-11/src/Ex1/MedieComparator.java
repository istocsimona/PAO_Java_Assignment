package Ex1;
import java.util.Comparator;

public class MedieComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1); // descrescător
    }
}

