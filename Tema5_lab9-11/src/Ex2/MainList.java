package Ex2;
import java.util.Arrays;

public class MainList {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(1);
        list.add(1); // duplicat permis
        list.addAll(Arrays.asList(2, 3, 3)); // duplicate permise

        System.out.println("List: " + list);
        System.out.println("Total elemente adăugate (inclusiv duplicate): " + list.getTotalAdaugate());
    }
}

