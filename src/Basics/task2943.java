package Basics;

import java.util.Scanner;

public class task2943 {
    public static void main(String[] args) {
    /*
    Задача №2943. Число десятков
Дано неотрицательное целое число. Найдите число десятков в его десятичной записи
(то есть вторую справа цифру его десятичной записи).

Входные данные
Вводится неотрицательное целое число.

Выходные данные
Выведите ответ на задачу.

Примеры
Входные данные
179
Выходные данные
7
     */
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        input = Math.abs(input);
        int tens = (input / 10) % 10;

        System.out.println(tens);

//        if(input.length() >= 2) {
//            char output = input.charAt(input.length() - 2);
//        System.out.println(output);}
//        else {
//            System.out.println(input);
//        }

    }
}
