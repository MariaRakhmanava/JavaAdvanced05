package homework.HW5;

import static homework.HW5.Sex.female;

public class Main {
    public static void main(String args[]) {
        Person person = new Person("Maria",  female, 1993);
        System.out.println(person.getName());
    }
}
