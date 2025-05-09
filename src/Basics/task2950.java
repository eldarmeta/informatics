package Basics;

import java.util.Scanner;

public class task2950 {
    public static void main(String[] args) {
        /*        Задача №2950. Конец уроков
В некоторой школе занятия начинаются в 9:00. Продолжительность урока — 45 минут,
 после 1-го, 3-го, 5-го и т.д. уроков перемена 5 минут, а после 2-го, 4-го, 6-го и т.д.
  — 15 минут. Определите, когда заканчивается указанный урок.

Входные данные
Дан номер урока (число от 1 до 10).

Выходные данные
Выведите два целых числа: время окончания урока в часах и минутах.
При решении этой задачи нельзя пользоваться циклами и условными инструкциями.

Примеры
Входные данные
3
Выходные данные
11 35
Входные данные
2
Выходные данные
10 35
         */
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int minutesLesson = input * 45;
        int breaks15 = (input - 1) / 2;
        int breaks5 = (input - 1) - breaks15;

        int minutesBreaks = breaks15 * 15 + breaks5 * 5;

        int totalMinutes = minutesLesson + minutesBreaks;
        int hour = 9 + totalMinutes / 60;
        int minute = totalMinutes % 60;

        System.out.println(hour + " " + minute);






            }
}
