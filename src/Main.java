import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        List<Person> actor = new ArrayList<>();
        actor.add(new Person("Benedict", "Timothy Carlton Cumberbatch", 46));
        actor.add(new Person("Morena", "Silva de Vaz Setta Baccarin", 43));
        actor.add(new Person("Benicio", "Monserrate Rafael del Toro Sánchez", 56));
        actor.add(new Person("Mel", "Colmcille Gerard Gibson", 67));
        actor.add(new Person("Emilia", "Isobel Euphemia Rose Clarke", 36));
        actor.add(new Person("Anya-Josephine", "Marie Taylor Joy", 26));

        List<Person> personList = new ArrayList<>();
        personList.sort((o1, o2) -> {
            StringTokenizer st1 = new StringTokenizer(o1.getSurname());
            StringTokenizer st2 = new StringTokenizer(o2.getSurname());
            int maxAmountWords = 0;
            if (st1.countTokens() >= maxAmountWords || st2.countTokens() >= maxAmountWords) {
                if (st1.countTokens() < st2.countTokens()) {
                    return -1;
                } else if (st1.countTokens() > st2.countTokens()) {
                    return 1;
                }
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        System.out.println(actor);
    }

}