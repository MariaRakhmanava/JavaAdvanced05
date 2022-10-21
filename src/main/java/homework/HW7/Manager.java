package homework.HW7;

import homework.HW5.Sex;

public class Manager extends Employee {
    private int numberOfSubordinates;
    private double salaryPerDay;
    private double baseSalary;

    public Manager() {
        super();
        numberOfSubordinates = 0;
    }
    public Manager(String name, Sex sex, int age, int salaryPerDay, int baseSalary, int numberOfSubordinates) {
        super(name, sex, age);
        this.baseSalary = baseSalary;
        this.salaryPerDay = salaryPerDay;
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int number) {
        numberOfSubordinates = number;
    }
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double getSalary(Month[] months) {
        double ultimateSalary = 0;
        if (numberOfSubordinates == 0) {
            for (Month month : months) {
                ultimateSalary += month.getNumberOfDaysToWork() * salaryPerDay;
            }
            return ultimateSalary;
        } else {
            for (Month month : months) {
                ultimateSalary += month.getNumberOfDaysToWork() * salaryPerDay;
            }
            return ultimateSalary += numberOfSubordinates * 0.01 * ultimateSalary;
        }
    }
    @Override
    public double getSalary() {
        double salaryToReturn = 0;
        salaryToReturn = (numberOfSubordinates != 0) ? (baseSalary*(numberOfSubordinates/100*3)) : baseSalary;
        return salaryToReturn;
    }
    @Override
    public String toString() {
       return getName()
               + ", age: "
               + getAge()
               + ", salary per day: "
               + salaryPerDay
               + ", number of subordinates: "
               + numberOfSubordinates
               + ".";
    }
}

/* Class Manager before change

class Manager extends Employee {

    private int numberOfSubordinates;

    Manager() {
        super();
        numberOfSubordinates = 0;
    }
    Manager(String name, double baseSalary, double salary, int numberOfSubordinates) {
        super(name, baseSalary, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int number) {
        numberOfSubordinates = number;
    }
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (numberOfSubordinates != 0) {
            return getBaseSalary()*(numberOfSubordinates/100*3);
        } else {
            return getBaseSalary();
        }
    }
}
*/
