package homework.HW4;

import homework.Task;

public class Main {
    public static void main (String[]  args) {

        // Task 1
        Task.printTaskNumber(1);
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        Task.separateTasks();

        //Task 2
        Task.printTaskNumber(2);
        for (i = 0; i < 11; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int l = 0; l <= 9 - i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        Task.separateTasks();

        //Task 3
        Task.printTaskNumber(3);
        for (i = 0; i < 11; i++) {
            for (int u = 0; u <= i; u++) {
                System.out.print("  ");
            }
            for (j = 9 - i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int l = 1; l < 10 - i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        Task.separateTasks();

        //Task 4
        Task.printTaskNumber(4);
        System.out.println(Operations.addUpNumbers(3, 5));
        System.out.println(Operations.subtractANumber(2, 78));
        System.out.println(Operations.multiplyNumbers(9, -10));
        System.out.println(Operations.divideANumber(5, 0));
        System.out.println(Operations.divideANumber(- 4,1));
    }
}
