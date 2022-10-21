package homework.HW7;

import homework.HW5.Sex;

public abstract class Employee {
    private String name;
    private Sex sex;
    private int age;

    public Employee() {
        name = null;
        sex = Sex.male;
        age = 0;
    }
    public Employee(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Employee(Employee employee) {
        name = employee.name;
        sex = employee.sex;
        age = employee.age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Sex getSex() {
        return sex;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    abstract double getSalary();
}

/* Class Employee before change

abstract class Employee {

    private String name;
    private double baseSalary;
    private double salary;

    Employee() {
        name = null;
        baseSalary = 0.0;
        salary = 0.0;
    }
    Employee(String name, double baseSalary, double salary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.salary = salary;
    }
    Employee(String name, double salary) {
        this.name = name;
        baseSalary = this.salary = salary;
    }
    Employee(Employee employee) {
        name = employee.name;
        baseSalary = employee.baseSalary;
        salary = employee.salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBaseSalary(double salary) {
         baseSalary = salary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    abstract double getSalary();
}
*/
