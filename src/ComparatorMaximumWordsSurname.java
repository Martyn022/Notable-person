import java.util.Comparator;
import java.util.StringTokenizer;

public class ComparatorMaximumWordsSurname implements Comparator<Person> {
    private int maxAmountWords;

    public ComparatorMaximumWordsSurname(int maxAmountWords) {
        this.maxAmountWords = maxAmountWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        StringTokenizer st1 = new StringTokenizer(o1.getSurname());
        StringTokenizer st2 = new StringTokenizer(o2.getSurname());
        if (st1.countTokens() >= maxAmountWords || st2.countTokens() >= maxAmountWords) {
            if (st1.countTokens() < st2.countTokens()) {
                return -1;
            } else if (st1.countTokens() > st2.countTokens()) {
                return 1;
            }
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
