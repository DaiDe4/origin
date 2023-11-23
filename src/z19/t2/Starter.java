package z19.t2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Петренко Артём1", 29, 2, 18));
        s.add(new Student("Петренко Артём2", 61, 2, 18));
        s.add(new Student("Петренко Артём3", 45, 1, 19));
        s.add(new Student("Петренко Артём4", 67, 2, 18));
        s.add(new Student("Петренко Артём5", 24, 1, 18));

        new Class(s);
    }

}
