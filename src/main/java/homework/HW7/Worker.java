package homework.HW7;

import homework.HW5.Sex;

class Worker extends Employee {
    private double salaryPerDay;
    private double baseSalary;

    Worker(String name, Sex sex, int age, double dailySalary, double salary) {
        super(name, sex, age);
        salaryPerDay = dailySalary;
        baseSalary = salary;
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }
}

/* Class Worker before change

class Worker extends Employee {

    Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }
}
*/
