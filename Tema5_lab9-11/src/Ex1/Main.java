package Ex1;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog(new MedieComparator());

        catalog.add(new Student("Ana", 9.6f));
        catalog.add(new Student("Bogdan", 7.8f));
        catalog.add(new Student("Cristina", 7.5f));
        catalog.add(new Student("Doru", 9.4f));
        catalog.add(new Student("Elena", 8.3f));
        catalog.add(new Student("Florin", 5.2f));

        for (Map.Entry<Integer, List<Student>> entry : catalog.entrySet()) {
            List<Student> studenti = entry.getValue();
            studenti.sort(Comparator.comparing(Student::getNume));

            System.out.println("Media: " + entry.getKey());
            for (Student s : studenti) {
                System.out.println("  " + s);
            }
        }
    }
}
