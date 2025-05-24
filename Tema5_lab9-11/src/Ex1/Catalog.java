package Ex1;
import java.util.*;

public class Catalog extends TreeMap<Integer, List<Student>> {

    public Catalog(Comparator<Integer> comparator) {
        super(comparator);
    }

    private int rotunjireMedie(float medie) {
        int medieRotunjita = Math.round(medie);
        if (medieRotunjita < 0 || medieRotunjita > 10) {
            throw new IllegalArgumentException("Media rotunjită trebuie să fie între 0 și 10");
        }
        return medieRotunjita;
    }

    public void add(Student student) {
        int medieRotunjita = rotunjireMedie(student.getMedie());
        List<Student> lista = this.get(medieRotunjita);
        if (lista == null) {
            lista = new ArrayList<>();
            this.put(medieRotunjita, lista);
        }
        lista.add(student);
    }
}
