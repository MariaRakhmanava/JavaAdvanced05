package homework.HW4;

public class Operations {
    public static int addUpNumbers(int x, int y) {
        return x+y;
    }

    public static int subtractANumber(int x, int y) {
        return x-y;
    }

    public static int multiplyNumbers(int x, int y) {
        return x*y;
    }

    public static int divideANumber(int x, int y) {
        if (y == 0) {
            System.out.print("Cannot be divided by zero! ");
            System.out.print("Process finished with exit code ");
            return 1;
        }
        else {
            return x/y;
        }
    }
}
