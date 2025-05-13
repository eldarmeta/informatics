public class code17 {
        public static void main(String[] args) {
            // Массив имён студентов
            String[] students = {"Aman", "Bakyt", "Cholpon", "Eldar", "Zarina"};

            // Массив оценок, соответствующих студентам
            int[] grades = {85, 90, 78, 92, 88};

            System.out.println("📚 Список студентов и оценок:");
            printAllStudents(students, grades);

            System.out.println("\n📊 Средняя оценка: " + calculateAverage(grades));

            int topStudentIndex = findTopStudent(grades);
            System.out.println("\n🏆 Лучший студент: " + students[topStudentIndex] + " с оценкой " + grades[topStudentIndex]);
        }

        // Метод для вывода всех студентов и их оценок
        public static void printAllStudents(String[] names, int[] grades) {
            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i] + " - " + grades[i]);
            }
        }

        // Метод для нахождения средней оценки
        public static double calculateAverage(int[] grades) {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.length;
        }

        // Метод для нахождения индекса лучшего студента
        public static int findTopStudent(int[] grades) {
            int max = grades[0];
            int index = 0;
            for (int i = 1; i < grades.length; i++) {
                if (grades[i] > max) {
                    max = grades[i];
                    index = i;
                }
            }
            return index;
        }
    }


