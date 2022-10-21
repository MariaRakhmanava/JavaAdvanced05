package homework.HW7;

public class MonthUtils {

    public static Month[] getFullYearMonths() {
        Month[] months = new Month[12];
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                    months[i] = new Month("January", 31, 20);
                    break;
                case 1:
                    months[i] = new Month("February", 28, 22);
                    break;
                case 2:
                    months[i] = new Month("March", 31, 20);
                    break;
                case 3:
                    months[i] = new Month("April", 30, 22);
                    break;
                case 4:
                    months[i] = new Month("May", 31, 23);
                    break;
                case 5:
                    months[i] = new Month("June", 30, 22);
                    break;
                case 6:
                    months[i] = new Month("July", 31, 23);
                    break;
                case 7:
                    months[i] = new Month("August", 31, 23);
                    break;
                case 8:
                    months[i] = new Month("September", 30, 22);
                    break;
                case 9:
                    months[i] = new Month("October", 31, 23);
                    break;
                case 10:
                    months[i] = new Month("November", 30, 22);
                    break;
                case 11:
                    months[i] = new Month("December", 31, 19);
                    break;
            }
        }
        return months;
    }

    public static Month[] getFirstHalfAYearMonths() {
        Month[] months = new Month[6];
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    months[i] = new Month("January", 31, 20);
                    break;
                case 1:
                    months[i] = new Month("February", 28, 22);
                    break;
                case 2:
                    months[i] = new Month("March", 31, 20);
                    break;
                case 3:
                    months[i] = new Month("April", 30, 22);
                    break;
                case 4:
                    months[i] = new Month("May", 31, 23);
                    break;
                case 5:
                    months[i] = new Month("June", 30, 22);
                    break;
            }
        }
        return months;
    }

    public static Month[] getSecondHalfAYearMonths() {
        Month[] months = new Month[6];
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    months[i] = new Month("July", 31, 23);
                    break;
                case 1:
                    months[i] = new Month("August", 31, 23);
                    break;
                case 2:
                    months[i] = new Month("September", 30, 22);
                    break;
                case 3:
                    months[i] = new Month("October", 31, 23);
                    break;
                case 4:
                    months[i] = new Month("November", 30, 22);
                    break;
                case 5:
                    months[i] = new Month("December", 31, 19);
                    break;
            }
        }
        return months;
    }
}
