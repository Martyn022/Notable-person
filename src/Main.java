import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> actor = new ArrayList<>();
        actor.add(new Person("Grace", "Mckenna", 16));
        actor.add(new Person("Benedict", "Timothy Carlton Cumberbatch", 46));
        actor.add(new Person("Morena", "Silva de Vaz Setta Baccarin", 43));
        actor.add(new Person("Emilia", "Isobel Euphemia Rose Clarke", 36));
        actor.add(new Person("Abby", "Ryder Fortson", 15));
        actor.add(new Person("Anya-Josephine", "Marie Taylor Joy", 26));

        Predicate<Person> predicate = (person -> person.getAge() < 18);
        actor.removeIf(predicate);

        System.out.println(actor);
    }

}