package conoo;

import java.util.Scanner;

    public class fullcode {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Ввод начальной позиции короля
            System.out.println("Введите координаты короля (столбец и строка от 1 до 8):");
            int a = sc.nextInt(); // столбец (по горизонтали)
            int b = sc.nextInt(); // строка (по вертикали)

            // Ввод координат цели
            System.out.println("Введите координаты цели (столбец и строка от 1 до 8):");
            int c = sc.nextInt();
            int d = sc.nextInt();

            // Проверка на корректность
            if (!isValid(a, b) || !isValid(c, d)) {
                System.out.println("Ошибка: координаты должны быть от 1 до 8.");
                return;
            }

            // Проверка, может ли король сходить за 1 ход
            boolean canMove = Math.abs(a - c) <= 1 && Math.abs(b - d) <= 1;

            // Визуализация доски 8x8
            System.out.println("\n📦 Шахматная доска (K = король, X = возможные ходы, T = цель):\n");
            for (int row = 8; row >= 1; row--) {
                for (int col = 1; col <= 8; col++) {
                    if (col == a && row == b) {
                        System.out.print(" K ");
                    } else if (col == c && row == d) {
                        System.out.print(" T ");
                    } else if (Math.abs(col - a) <= 1 && Math.abs(row - b) <= 1) {
                        System.out.print(" X ");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println("  " + row); // номер строки
            }

            System.out.println(" A  B  C  D  E  F  G  H");

            // Вывод результата
            System.out.println("\nРезультат: " + (canMove ? "YES — король может дойти." : "NO — не может за один ход."));
        }

        // Метод для проверки корректности координат
        public static boolean isValid(int x, int y) {
            return x >= 1 && x <= 8 && y >= 1 && y <= 8;
        }
    }

