package homework.HW6;

import java.util.ArrayList;

public class Individual {
    private String name;
    private int age;
    private String country;
    private double salary;
    private String education;

    Individual(String name, int age, String country, double salary, String education) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.salary = salary;
        this.education = education;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public String toString() {
        return name + age + country + salary + education;
    }
    public static ArrayList<Individual> sortByCountry(Individual[] individuals) {
        ArrayList<String> countries = new ArrayList<>();
        String country = individuals[0].getCountry();
        countries.add(country);
        for (int i = 1; i < individuals.length; i++) {
            for (int j = 0; j < countries.size(); j++) {
                if (!(individuals[i].getCountry().equals(countries.get(j)))) {
                    if (j == (countries.size() - 1)) {countries.add(individuals[i].getCountry());}
                } else {
                    break;
                }
            }
        }
        ArrayList<Individual> peopleArrayListSortedByCountry = new ArrayList<>();
        for (int i = 0; i < countries.size(); i++) {
            for (int j = 0; j < individuals.length; j++) {
                if (individuals[j].getCountry().equals(countries.get(i))) {
                    peopleArrayListSortedByCountry.add(individuals[j]);
                }
            }
        }
        return peopleArrayListSortedByCountry;
    }
}
