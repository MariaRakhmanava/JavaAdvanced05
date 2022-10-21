package homework.HW6;

import homework.Task;

import static homework.HW5.Sex.female;
import static homework.HW5.Sex.male;

public class Main {

    public static void main(String args[]) {

        Employee [] employees = new Employee[3];
        employees[0] = new Employee("Katherine", female, 1989, 1780.5);
        employees[1] = new Employee("Mark", male, 1983, 2560);
        employees[2] = new Employee("Katherine", female, 1985, 1900.5);
        //Task 3 check
        Task.printTaskNumber(3);
        System.out.println(employees[0].isSameName(employees[1]));
        System.out.println(employees[0].isSameName(employees[2]));
        Task.separateTasks();
        //Task 4 check
        Task.printTaskNumber(4);
        System.out.println(SalaryUtils.getSum(employees));
        Task.separateTasks();
        //Task 5 check
        Task.printTaskNumber(5);
        System.out.println(EmployeeUtils6.getByName(employees, "Katherine"));
        System.out.println(EmployeeUtils6.getByPieceOfName(employees, "Kat"));
        System.out.println(EmployeeUtils6.calculateSalaryBudget(employees));
        System.out.println(EmployeeUtils6.findByMinSalary(employees));
        System.out.println(EmployeeUtils6.findByMaxSalary(employees));
        Task.separateTasks();
        //Task from Alice
        Individual[] people = new Individual[8];
        people[0] = new Individual("Paul", 32, "Belarus", 2500, "Mag");
        people[1] = new Individual("Maria", 29, "Belarus", 1500, "Mag");
        people[2] = new Individual("Irina", 39, "USA", 4000, "PhD");
        people[3] = new Individual("Mateusz", 40, "Poland", 1900, "Bach");
        people[4] = new Individual("Stefano", 36, "Italy", 2100, "PhD");
        people[5] = new Individual("Illario", 38, "USA", 1900, "Mag");
        people[6] = new Individual("Kasia", 30, "Poland", 1500, "Mag");
        people[7] = new Individual("Eric", 34, "USA", 2000, "PhD");
        System.out.println(Individual.sortByCountry(people));
    }
}
