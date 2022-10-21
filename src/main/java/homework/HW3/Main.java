package homework.HW3;

import homework.Task;

public class Main {
    public static void main(String args[]) {

        //Task 1
        Task.printTaskNumber(1);
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        System.out.println(sum);
        Task.separateTasks();

        //Task 2
        Task.printTaskNumber(2);
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        Task.separateTasks();

        //Task 3
        Task.printTaskNumber(3);
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        Task.separateTasks();

        //Task 4
        Task.printTaskNumber(4);
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double av = 0;
        for (int x : array1) {
            av += x;
        }
        System.out.println(av / array1.length);
        Task.separateTasks();

        //Task 5
        Task.printTaskNumber(5);
        int table[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        sum = 0;
        int subSum = 0;
        for (int[] x : table) {
            for (int y = 0; y < x.length; y++) {
                subSum += x[y];
            }
            sum += subSum;
            subSum = 0;
        }
        System.out.println(sum);
        Task.separateTasks();

        //Task 6
        Task.printTaskNumber(6);
        max = table[0][0];
        for (int[] x : table) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] > max) {
                    max = x[i];
                }
            }
        }
        System.out.println(max);
        Task.separateTasks();

        //Task 7
        Task.printTaskNumber(7);
        sum = 0;
        for (int[] x : table) {
            sum += x.length;
        }
        System.out.println(sum);
    }
}
