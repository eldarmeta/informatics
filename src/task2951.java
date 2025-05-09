import java.util.Scanner;

public class task2951 {
    public static void main(String[] args) {
        /*        Задача №2951. Стоимость покупки
Пирожок в столовой стоит a рублей и b копеек.
Определите, сколько рублей и копеек нужно заплатить за n пирожков.

Входные данные
Программа получает на вход три числа: a, b, n.

Выходные данные
Программа должна вывести два числа: стоимость покупки в рублях и копейках.

Примеры
Входные данные
10
15
2
Выходные данные
20 30
Входные данные
2
50
4
Выходные данные
10 0         */
        Scanner scanner = new Scanner(System.in);
        int priceRub = scanner.nextInt();
        int priceCop = scanner.nextInt();
        int amount = scanner.nextInt();

        int output1 = priceRub * amount;
        int output2 = (priceCop * amount) / 100;
        int output3 = output1 + output2;
        int output4 = (priceCop * amount) % 100;

        System.out.println(output3 + " " + output4);

    }
}
