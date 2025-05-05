import java.util.Scanner;

public class task2938 {
    public static void main (String [] args){
        /*
        Задача №292. Максимум из двух чисел
Входные данные
Даны два целых числа, каждое число записано в отдельной строке.

Выходные данные
Выведите наибольшее из данных чисел.

Примеры
Входные данные
1
2
Выходные данные
2
         */
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
        scanner.close();
    }
}
