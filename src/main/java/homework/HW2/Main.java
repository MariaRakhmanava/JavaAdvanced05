package homework.HW2;

import homework.Task;

public class Main {

    public static void main(String args[]) {

        //Task 1
        Task.printTaskNumber(1);
        int a = 73, b = 90;
        if (a > b) {
            System.out.println(a + ">" + b);
        }
        else if(a < b) {
            System.out.println(a + "<" + b);
        }
        else {
            System.out.println(a + "=" + b);
        }
        Task.separateTasks();

        //Task 2
        Task.printTaskNumber(2);
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a nad b are even");
        } else {
            System.out.println("some variable is odd");
        }
        Task.separateTasks();

        //Task 3
        Task.printTaskNumber(3);
        int x = 1089;
        if (x > 10) {
            System.out.println("Переменная больше 10");
        }
        if (x < 100) {
            System.out.println("Переменная меньше 100");
        }
        if ((x/2) > 20) {
            System.out.println("Результат деления на 2 больше 20");
        }
        if ( x >= 5 && x  <= 40) {
            System.out.println("Значение переменной между 5 и 40 включттельно");
        } else {
            System.out.println("Значение переменной меньше 5 или больше 40");
        }
        Task.separateTasks();

        //Task 4
        Task.printTaskNumber(4);
        for (int i = 0; i < 16; i++) {
            System.out.print(i + " ");
        }
        Task.separateTasks();

        //Task 5
        Task.printTaskNumber(5);
        for (int i =1; Math.pow(5, i) < 10_000; i++) {
            System.out.print(Math.pow(5, i) + " ");
        }
        Task.separateTasks();

        //Task 6
        Task.printTaskNumber(6);
        //Option A
        for (int i = 40; i < 61; i+=4) {
            System.out.print(i + " ");
        }
        Task.separateTasks();
        //Option B
        for (int i = 40; i < 61; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            } else continue;
        }
    }
}

