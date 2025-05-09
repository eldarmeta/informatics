package Basics;

import java.util.Scanner;

public class task2945 {
    public static void main(String[] args) {
        /* Задача №2945. Следующее четное
Дано целое число n. Выведите следующее за ним четное число.
При решении этой задачи нельзя использовать условную инструкцию if и циклы.

Входные данные
Вводится натуральное число.

Выходные данные
Выведите ответ на задачу.

Примеры
Входные данные
7
Выходные данные
8
Входные данные
8
Выходные данные
10      */
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

       int nextEven = input + 2 - (input % 2);
       System.out.println(nextEven);



scanner.close();
    }
}
