package homework.HW7;

public class Month {
    private String name;
    private int numberOfDays;
    private int numberOfDaysToWork;

    public Month() {
        name = null;
        numberOfDays = numberOfDaysToWork = 0;
    }
    public Month(String name, int days) {
        this.name = name;
        numberOfDays = numberOfDaysToWork = days;
    }
    public Month(String name, int numberOfDays, int numberOfDaysToWork) {
        this.name = name;
        this.numberOfDays = numberOfDays;
        this.numberOfDaysToWork = numberOfDaysToWork;
    }
    public Month(String name, Month month) {
        this.name = name;
        numberOfDays = month.numberOfDays;
        numberOfDaysToWork = month.numberOfDaysToWork;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
    public int getNumberOfDays() {
        return numberOfDays;
    }
    public void setNumberOfDaysToWork(int numberOfDaysToWork) {
        this.numberOfDaysToWork = numberOfDaysToWork;
    }
    public int getNumberOfDaysToWork() {
        return numberOfDaysToWork;
    }
    @Override
    public String toString() {
        return "name: "
                + name
                + ", number of days: "
                + numberOfDays
                + ", number of days to work: "
                + numberOfDaysToWork;
    }
}
