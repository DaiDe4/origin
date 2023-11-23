package z19.t2;

import java.util.Comparator;

public class Comparator3 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNumGroup() - o2.getNumGroup();
    }
}
