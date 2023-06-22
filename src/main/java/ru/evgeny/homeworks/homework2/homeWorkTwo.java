package ru.evgeny.homeworks.homework2;

import java.util.Scanner;

public class homeWorkTwo {
    public static void main(String[] args) {
        homeWorkOne();
        homeWorkTwo();
        System.out.println(homeWorkThree(-100));
        homeWorkFour();
        System.out.println("Это високосный год ?" + homeWorkFive(1600));

    }

    // Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.
    public static void homeWorkOne() {
        int a = 3;
        int b = 14;
        if (a + b <= 20 && a + b >= 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

//    Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void homeWorkTwo() {
        int a = 0;
        if (a >= 0) {
            System.out.println(a + " положительное");
        } else {
            System.out.println(a + " отрицательное");
        }

    }

//    Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
//    если число отрицательное, и вернуть false если положительное.


    private static boolean homeWorkThree(int number) {
        return number < 0;

    }

// Написать метод, которому надо отпечатать в консоль указанную строку, указанное количество раз;

    public static int homeWorkFour() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Привет");
        }
        return 0;
    }

//    * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
//    не високосный - false). Каждый 4-й год являв качестве аргументов передается строка и число, метод должен вернуется
//    високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    private static boolean homeWorkFive(int year) {
        boolean result = false;
        if (year % 4 == 0 && year % 100 != 0) {
            result = true;
        } else if (year % 400 == 0) {
            result = true;
        }
        return result;
    }
}



