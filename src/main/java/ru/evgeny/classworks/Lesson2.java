package ru.evgeny.classworks;

public class Lesson2 {
    public static void main(String[] args) {
//      static int classIntVariable = 15;
//      methodsExample();
//      vendingWithIfs();
//      vendingWithSwitch();
//      vendingWithSwitchModern();
//      forLoopExample();
//      forLoopDouble();

        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 110;
        arr[4] = 5;

        arr[1] = (arr[1] + arr[3]) / arr[2];
        System.out.println(arr[1]);

//        System.out.println(arr[5]);
        System.out.println(arr.length);  //  взять длину массива length

        int[] arr1 = {1,2,3,5,6,6,7,8,9,9,4};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");

        }

    }

    private static void forLoopDouble() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Exercise #%d: ", i);
            for (int j = 1; j < 11; j++) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }
    }

    private static void forLoopExample() {
        //    Инициализация                 ; условие                   ;итерация
        for (int a = 0, b = 10, c = 100; a < 10 && b > 0 && c > 10; a++, b--, c -= 10) {
            System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        int counter = 1;
        for (;;counter++) {
            System.out.println(counter);
            if (counter > 10) {
                break;
            }
        }
    }

    public  static void vendingWithSwitchModern() { // Java 14+
        int choice = 5;

        switch (choice) {
            case 1 -> System.out.println("Give Lays");
            case 2 -> System.out.println("Give Cheetos");
            case 3 -> System.out.println("Give Coca Cola");
            case 4 -> System.out.println("Give Pepsi");
            case 5 -> System.out.println("Give Snickers");
            default -> System.out.println("Error. Try again");
        }
    }
    public  static void vendingWithSwitch() {
        int choice = 4;

        switch (choice) {
            case 1:
            case 8:
            case 24:
            case 43:
                System.out.println("Give Lays");
                break;
            case 2:
                System.out.println("Give Cheetos");
                break;
            case 3:
                System.out.println("Give Coca Cola");
                break;
            case 4:
                System.out.println("Give Pepsi");
                break;
            case 5:
                System.out.println("Give Snickers");
                break;
            default:
                System.out.println("Error. Try again");
        }
    }

    public  static void vendingWithIfs() {
        int choice = 4;

        if(choice ==1) {
            System.out.println("Give Lays");
        } else if (choice == 2) {
            System.out.println("Give Cheetos");
        } else if (choice == 3) {
            System.out.println("Give Coca Cola");
        } else if (choice == 4) {
            System.out.println("Give Pepsi");
        } else if (choice == 5) {
            System.out.println("Give Snickers");
        } else {
            System.out.println("Error. Try again");
        }
    }

    private void methodsExample() {
        printSomethingIntoConsole();
        printArgumentValueIntoConsole("hello");

        double someNumber = calculateSomeExpression(.24, 5.25);
    }

    public static void printSomethingIntoConsole() {
        System.out.println("Something");
    }

    public static void printArgumentValueIntoConsole(String word) {
        System.out.printf("Your argument was: %s\n", word);
    }
    public static double calculateSomeExpression(double firstValue, double secondValue) {
        double result = firstValue / secondValue;
        System.out.println("Calculating...");
        //     System.out.println("first value: " + firstValue + "; second value: " + secondValue + "; result is: " + result);
        //     System.out.printf("First value: %f; second value: %f; result is: %f\n", firstValue, secondValue, result);
        String s = String.format("First value: %f; second value: %f; result is: %f\n", firstValue, secondValue, result);
        /* Placeholder — это вспомогательный текст, который располагают в форме ввода данных.
        Его главная задача заключается в том, чтобы подсказать пользователю, какую информацию нужно указать в конкретном поле.
        * %s -  string and universal - можно всунуть любой объект (
        * %d - integers - целые числа
        * %f - floats - числа с плавающей запятой
        * %c - characters - символы
        * %b - boolean
         */
        System.out.print(s);
        return result;
    }
}
