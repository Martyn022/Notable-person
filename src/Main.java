import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Benedict", "Timothy Carlton Cumberbatch", 46));
        person.add(new Person("Morena", "Silva de Vaz Setta Baccarin", 43));
        person.add(new Person("Benicio", "Monserrate Rafael del Toro Sánchez", 56));
        person.add(new Person("Mel", "Colmcille Gerard Gibson", 67));
        person.add(new Person("Emilia", "Isobel Euphemia Rose Clarke", 36));
        person.add(new Person("Anya-Josephine", "Marie Taylor Joy", 26));
        Collections.sort(person, new ComparatorMaximumWordsSurname(3));

        System.out.println(person);
    }

}