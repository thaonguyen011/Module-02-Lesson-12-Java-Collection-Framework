import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int o1Age = o1.getAge();
        int o2Age = o2.getAge();
        return Integer.compare(o1Age, o2Age);

    }
}
