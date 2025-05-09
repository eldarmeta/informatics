package Basics;

import java.util.Scanner;

public class apple2 {
    public static void main(String[] args){

        /*
        Задача №2939. Дележ яблок - 2
N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок останется в корзинке?

Входные данные
Программа получает на вход числа N и K.

Выходные данные
Программа должна вывести искомое количество яблок.

Примеры
Входные данные
3
14
Выходные данные
2
         */
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();


        int rest = K % N;


        System.out.println(rest);

scanner.close();
    }
}
