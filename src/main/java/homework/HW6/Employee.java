package homework.HW6;

import homework.HW5.Person;
import homework.HW5.Sex;

public class Employee extends Person {
        private double salary;

        Employee() {
            super();
            salary = 0.0;
        }
        Employee(String name, Sex sex, int yearOfBirth, double salary) {
            super(name, sex, yearOfBirth);
            this.salary = salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
        public double getSalary() {
            return salary;
        }
        public boolean isSameName(Employee employee) {
            if ( getName().equals(employee.getName()) ) {
                return true;
            } else return false;
        }
        @Override
        public String toString() {
            return "Name: " + getName()
                    + "  "
                    + "Age: " + getAge()
                    + "  "
                    + getSex()
                    + "  "
                    + "Year of birth: " + getYearOfBirth()
                    + "Salary: " + salary;
        }
}
