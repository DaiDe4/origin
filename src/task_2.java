import java.util.*;

public class task_2 {
    public static void main(String[] args) {

        Dog doga = new Dog("Nora", 10);
        doga.setAge(3);
        System.out.println(doga);

        Dog dogs[] = {new Dog("Shiro", 2), new Dog("Gerda", 15), new Dog("Sharik", 3)};

        Dog_pitomnik dog_pitomnik = new Dog_pitomnik();
        System.out.println(dog_pitomnik);

        dog_pitomnik.add_dog(doga);
        System.out.println(dog_pitomnik);

        dog_pitomnik.add_dogs(dogs);
        System.out.println(dog_pitomnik);
    }
}


class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHumanAge() {
        return this.age * 7;
    }

    public String toString() {
        return "Dogname = " + this.name + ", age = " + this.age;
    }
}

class Dog_pitomnik {
    private List<Dog> dog_pitomnik_array = new ArrayList<Dog>();

    {
        System.out.println("\nDog_pitomnik ");
    }

    public void add_dog(Dog dog) {
        this.dog_pitomnik_array.add(dog);
        System.out.println(dog + " added.");
    }

    public void add_dogs(Dog dogs[]) {
        this.dog_pitomnik_array.addAll(new ArrayList<Dog>(Arrays.asList(dogs)));
        System.out.println("Dogs: " + Arrays.toString(dogs) + " added.");
    }

    public String toString() {
        if (!this.dog_pitomnik_array.isEmpty())
            return "Dog pitomnik: " + this.dog_pitomnik_array;
        else
            return "Dog pitomnik empty!";
    }
}
