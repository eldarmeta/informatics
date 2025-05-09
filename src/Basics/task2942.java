package Basics;

import java.util.Scanner;

public class task2942 {
    public static void main(String [] args){
        /*
        Задача №2942. Число десятков двузначного числа
Дано двузначное число. Найдите число десятков в нем.

Входные данные
Вводится двухзначное число.

Выходные данные
Выведите ответ на задачу.

Примеры
Входные данные
42
Выходные данные
4
         */
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char output = input.charAt(input.length() - 2);
        System.out.println(output);



    }
}
