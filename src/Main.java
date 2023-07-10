import java.util.Random;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();



    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int summa = 0;
        for (int i : arr) {
            summa += i;

        }
        System.out.println("Сумма трат за месяц составила: " + summa + " рублей");
    }
    // Пишем код для задачи 1


    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила: " + max + " рублей");

    }
    // Пишем код для задачи 2

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        float average = 0;

        for (int i : arr) {
            average += i / 30;
        }

        System.out.println("Средняя сумма трат за месяц составила: " + average + " рублей");
        // Пишем код для задачи 3

    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);
        }
    }
}




