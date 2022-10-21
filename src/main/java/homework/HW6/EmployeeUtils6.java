package homework.HW6;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils6 {
    //To find an employee(employees) by name given
    public static List<Employee> getByName(Employee[] employees, String employeeName) {
        List<Employee> employeesFound = new ArrayList<>();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().toLowerCase().equals(employeeName.toLowerCase())) {
                employeesFound.add(employees[i]);
            }
        }
        return employeesFound;
    }

    //To find an employee(employees) by some characters of his/her name
    public static List<Employee> getByPieceOfName(Employee[] employees, String pieceOfName) {
        List<Employee> employeesFound = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().contains(pieceOfName.toLowerCase())) {
                employeesFound.add(employee);
            }
        }
        return employeesFound;
    }

    //To calculate salary budget for all employees
    public static double calculateSalaryBudget(Employee[] employees) {
        double salaryBudget = 0;
        for (Employee employee : employees) {
            salaryBudget += employee.getSalary();
        }
        return salaryBudget;
    }

    //To find an employee(-s) with the min salary
    public static Employee findByMinSalary(Employee[] employees) {
        Employee employeeFound = employees[0];
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                employeeFound = employee;
            }
        }
        return employeeFound;
    }

    //To find an employee(-s) with the mx salary
    public static Employee findByMaxSalary(Employee[] employees) {
        Employee employeeFound = employees[0];
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                employeeFound = employee;
            }
        }
        return employeeFound;
    }
}
