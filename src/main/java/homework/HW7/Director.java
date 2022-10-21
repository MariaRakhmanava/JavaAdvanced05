package homework.HW7;

public class Director extends Manager{
    @Override
    public double getSalary(Month[] months) {
        if (getNumberOfSubordinates() != 0) {
            return super.getSalary(months) * 3;
        } else {
            return super.getSalary(months);
        }
    }
}

/* Class Director before change

class Director extends Manager{

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() != 0) {
            return super.getSalary() * 3;
        } else {
            return super.getSalary();
        }
    }
}
*/
