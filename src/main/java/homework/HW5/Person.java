package homework.HW5;

import java.util.Calendar;
import static homework.HW5.Sex.female;
import static homework.HW5.Sex.male;

public class Person {
    private String name;
    private int age;
    private Sex sex;
    private int yearOfBirth;

    public Person() {
        name = "unknown";
        sex = male;
        yearOfBirth = 0;
    }
    public Person(String name, Sex sex, int yearOfBirth) {
        this.name = name;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }
    public int getAge() {
        age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
        return age;
    }
    public Sex getSex() {
        return sex;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public String getName() {
        String malePrefix = "Mr. ";
        String femalePrefix = "Ms. ";
        if (sex == male) {
            return malePrefix + name;
        } else {
            return femalePrefix + name;
        }
    }
    @Override
    public String toString() {
        return "Name: " + getName()
                + "  "
                + "Age: " + getAge()
                + "  "
                + getSex()
                + "  "
                + "Year of birth: " + getYearOfBirth();
    }
}


