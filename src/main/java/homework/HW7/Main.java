package homework.HW7;

import homework.HW5.Sex;

public class Main {
    public static void main(String[] args) {
        //EmployeeUtils7 Class Check
        Manager[] managers = new Manager[3];
        managers[0] = new Manager("Alex", Sex.male, 38, 236, 4370, 12);
        managers[1] = new Manager("Giza", Sex.female, 36, 212, 3960, 7);
        managers[2] = new Manager("Oliver", Sex.male, 37, 210, 3550, 5);
        Month[] months = new Month[3];
        months[0] = new Month("January", 31, 20);
        months[1] = new Month("February", 28, 23);
        months[2] = new Month("March", 31, 25);
        System.out.println(EmployeeUtils7.getManagerWithMaxDifferenceBetweenSalaryAndBaseSalary(managers, months));
        System.out.println(EmployeeUtils7.getManagerWithMaxDifferenceBetweenSalaryAndBaseSalary(managers, MonthUtils.getFirstHalfAYearMonths()));
        System.out.println(EmployeeUtils7.getManagerWithMinSubordinates(managers));

    }
}
