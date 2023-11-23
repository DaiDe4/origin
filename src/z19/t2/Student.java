package z19.t2;

public class Student implements Comparable<Student> {
    private String fio;
    private int srBall, numGroup, age;

    public static final Comparator1 AGE_COMP = new Comparator1();
    public static final Comparator2 BALL_COMP = new Comparator2();
    public static final Comparator3 GROUP_COMP = new Comparator3();

    public Student(String fio, int srBall, int numGroup, int age) {
        this.fio = fio;
        this.srBall = srBall;
        this.numGroup = numGroup;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        if (fio.equals(""))
            throw new IsPysto();
        this.fio = fio;
    }

    public int getAvgPoint() {
        return srBall;
    }

    public void setSrBall(int srBall) {
        this.srBall = srBall;
    }

    public int getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", avgPoint=" + srBall +
                ", groupNum=" + numGroup +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.fio.compareTo(o.fio);
    }
}
