package ru.evgeny.homeworks.homework1;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
//        PrintThreeWords();     // задание 1
//        chekSumSing();         // задание 2
//        printColor();         // задание 3
//        compareNumbers();      // задание 4
//        compareNumbersTwo();
        consoleCompare();
    }

    public static void PrintThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void chekSumSing() {
        int a = 10;
        int b = 15;
        int c = a + b;
        System.out.println(c);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }

    }

    public static void printColor() {
        int value = 15;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = -14;
        int b = 15;
        if (a > b) {
            System.out.println("a>b");
        } else if (a == b) {
            System.out.println("a=b");
        } else if (a < b) {
            System.out.println("a<b");
        }
    }


    public static void compareNumbersTwo() {
        int a = -1;
        int b = 2;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    static void consoleCompare() {
        var scanner = new Scanner(System.in);
        System.out.print("Please enter number a >> ");
        var a = scanner.nextInt();
        System.out.println();
        System.out.print("Please enter number b >> ");
        var b = scanner.nextInt();

        compare(a, b);
    }

    static void compare(int a, int b) {
        if (a > b) {
            System.out.println("a>b");
        } else if (a == b) {
            System.out.println("a=b");
        } else if (a < b) {
            System.out.println("a<b");
        }
    }


}



