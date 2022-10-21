package homework.HW7;

import homework.HW6.EmployeeUtils6;

public class EmployeeUtils7 extends EmployeeUtils6 {

    public static Manager getManagerWithMinSubordinates(Manager[] managersArray) {
        Manager managerWithMinSubs = managersArray[0];
        for (Manager manager : managersArray) {
            if (manager.getNumberOfSubordinates() < managerWithMinSubs.getNumberOfSubordinates()) {
                managerWithMinSubs = manager;
            }
        }
        return managerWithMinSubs;
    }

    public static Manager getManagerWithMaxSubordinates(Manager[] managersArray) {
        Manager managerWithMaxSubs = managersArray[0];
        for (Manager manager : managersArray) {
            if (manager.getNumberOfSubordinates() > managerWithMaxSubs.getNumberOfSubordinates()) {
                managerWithMaxSubs = manager;
            }
        }
        return managerWithMaxSubs;
    }

    public static Manager getManagerWithMinDifferenceBetweenSalaryAndBaseSalary(Manager[] managersArray, Month[] monthsArray) {
        Manager managerWithMinDiff = managersArray[0];
        double minDifference = managersArray[0].getSalary(monthsArray) - managersArray[0].getBaseSalary() * monthsArray.length;
        for (Manager manager : managersArray) {
            double diffForManager = manager.getSalary(monthsArray) - manager.getBaseSalary() * monthsArray.length;
            if (diffForManager < minDifference) {
                managerWithMinDiff = manager;
            }
        }
        return managerWithMinDiff;
    }

    public static Manager getManagerWithMaxDifferenceBetweenSalaryAndBaseSalary(Manager[] managersArray, Month[] monthArray) {
        Manager managerWithMaxDiff = managersArray[0];
        double maxDifference = managersArray[0].getSalary(monthArray) - managersArray[0].getBaseSalary() * monthArray.length;
        for (Manager manager : managersArray) {
            double diffForManager = manager.getSalary(monthArray) - manager.getBaseSalary()* monthArray.length;
            if (diffForManager < maxDifference) {
                managerWithMaxDiff = manager;
            }
        }
        return managerWithMaxDiff;
    }
}
