package com.maxdrob.company;

import java.util.Scanner;

public class Main {


    //Task 1
        public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("плохо");
        System.out.printf("знаю ");
        System.out.println("программирование");


    //Task 2
        System.out.print((46.0 + 10.0) * (10.0 / 3.0));
        System.out.print ((29) * (4) * (-15));

        //Или так:

        double first = (46.0 + 10.0) * (10.0 / 3.0);
        int second = (29) * (4) * (-15);
        System.out.println("Result1: " + first);
        System.out.println("Result: " + second);

    //Task 3


        int a = 10500;
        int d = 10;
        double с = a / d;
        System.out.println(с);


    //Task 4

        double number1 = 3.6;
        double number2 = 4.1;
        double number3 = 5.9;
        double result = (number1 * number2 *number3);
        System.out.println(result);

    //Task 5
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int inputNum = scan.nextInt();
        System.out.println(inputNum);


    //Task 6
        System.out.println("Input another number: ");
        int b = scan.nextInt();

        if (b % 2 == 0 && b < 100) {
            System.out.println(b + " число четное");
        } else if (b > 100) {
            System.out.println(" Выход за пределы допустимого диапазона");
        } else {
            System.out.println(b + " число нечетное");
        }










    }
}
