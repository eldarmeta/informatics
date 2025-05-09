package Basics;

import java.util.Scanner;

public class apple1 {
    public static void main (String []args){

        /*
        Задача №2938. Дележ яблок - 1
N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок достанется каждому школьнику?

Входные данные
Программа получает на вход числа N и K.

Выходные данные
Программа должна вывести искомое количество яблок.

Примеры
Входные данные
3
14

Выходные данные
4
         */
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int each = K / N;
       // int rest = K % N;

//        int O = Math.divideExact(K, N);

        System.out.println(each);
    }

}
