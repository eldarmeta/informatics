import java.util.Scanner;

public class task2959 {
    public static void main(String[] args) {
            /* Задача №2959. Знак числа
    В математике функция sign(x) (знак числа) определена так:
    sign(x) = 1,   если x > 0,
    sign(x) = -1, если x < 0,
    sign(x) = 0,   если x = 0.

    Для данного числа x выведите значение sign(x).
    Входные данные
    Вводится число x.

            Выходные данные
    Выведите ответ на задачу.

    Примеры
    Входные данные
179
    Выходные данные
1   */

    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    if (input > 0){
        System.out.println("1");
    }
    else if (input < 0){
        System.out.println("-1");
    }else {
        System.out.println("0");}
    }
}

