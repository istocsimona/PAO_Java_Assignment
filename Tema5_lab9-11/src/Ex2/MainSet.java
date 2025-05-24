package Ex2;
import java.util.Arrays;

public class MainSet {
    public static void main(String[] args) {
        MySet set = new MySet();
        set.add(1);
        set.add(2);
        set.add(2); // duplicat

        set.addAll(Arrays.asList(2, 3, 4)); // 2 duplicat

        System.out.println("Set: " + set);
        System.out.println("Total elemente adăugate (fără duplicate): " + set.size());
        System.out.println("Total încercări de adăugare reușite (fără duplicate): " + set.getTotalAdaugate());
    }
}

